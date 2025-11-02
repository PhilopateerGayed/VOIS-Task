package data;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "amazonSearchData")
    public Object[][] amazonSearchData() {
        return new Object[][]{
                {"car accessories"},
        };
    }

    @DataProvider(name = "ksrtcData")
    public Object[][] ksrtcData() {
        return new Object[][]{
                {"CHIKKAMAGALURU", "BENGALURU", "14/11/2025", "6789125987", "test@gamil.com", "test name", "Male", "25"}
        };
    }
}