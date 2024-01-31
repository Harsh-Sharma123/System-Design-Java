
public class Adapter implements AppleCharger{

    private AndroidCharger androidCharger;

    public Adapter(AndroidCharger android){
        this.androidCharger = android;
    }

    @Override
    public void chargePhone(){
        androidCharger.chargeAndroidPhone();
    }


}
