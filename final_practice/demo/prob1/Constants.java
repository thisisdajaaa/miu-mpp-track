package final_practice.demo.prob1;

import java.util.Objects;

public enum Constants {
    MICROSOFT("Microsoft", 20000);

    private final String companyName;
    private final Integer salesTarget;

    Constants(String companyName, Integer salesTarget) {
        this.companyName = companyName;
        this.salesTarget = salesTarget;
    }

    public static Constants getCompanyName(String companyName) {
        for (Constants value : Constants.values()) {
            if (value.companyName.equals(companyName)) return value;
        }

        return null;
    }

    public static Constants getSalesTarget(Integer salesTarget) {
        for (Constants value : Constants.values()) {
            if (Objects.equals(salesTarget, value.salesTarget)) return value;
        }

        return null;
    }
}
