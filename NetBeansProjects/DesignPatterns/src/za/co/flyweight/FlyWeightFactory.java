package za.co.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hmanganyi
 */
public class FlyWeightFactory {

    private static FlyWeightFactory instance;
    private final Map flyWeight;

    private FlyWeightFactory() {
        flyWeight = new HashMap();
    }
    
    public synchronized IntrinsicVisitorData getFlyWeight(String division) {
        
        if(flyWeight.get(division) == null) {
            IntrinsicVisitorData visitorData = new FlyWeight(division);
            flyWeight.put(division, visitorData);
            return visitorData;
        }
        return (IntrinsicVisitorData)flyWeight.get(division);
    }

    public static FlyWeightFactory getInstance() {

        if (instance == null) {
            instance = new FlyWeightFactory();
        }
        return instance;
    }

    private class FlyWeight implements IntrinsicVisitorData {

        private String company;
        private String city;
        private String state;
        private String zipCode;

        public FlyWeight(String division) {

            switch (division) {
                case "NORTH":
                    setValues("DVT", "Cape Town", "Cape Town", "1904");
                    break;
                case "SOUTH":
                    setValues("DVT", "Johannesburg", "Johannesburg", "2000");
                    break;
            }
        }
        
        private void setValues(String company, String city, String state, String zipCode) {
            this.city = city;
            this.company = company;
            this.state = state;
            this.zipCode = zipCode;
        }

        @Override
        public String getCompany() {
            return company;
        }

        @Override
        public String getCity() {
            return city;
        }

        @Override
        public String getState() {
            return state;
        }

        @Override
        public String getZipCode() {
            return zipCode;
        }
    }
}
