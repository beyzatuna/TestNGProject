import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

    @Test
    void startCar() {
        System.out.println("Car started");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void drivedCar() {
        System.out.println("Car driving");
    }

    @Test(dependsOnMethods = "drivedCar")
    void stopCar() {
        System.out.println("Car stopped");
    }

    @Test(dependsOnMethods = {"stopCar", "drivedCar"}, alwaysRun = true)
    void parkCar() {
        System.out.println("Car parked");
    }
}
