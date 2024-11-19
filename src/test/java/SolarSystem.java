public class SolarSystem {
    public static void main(String[] args) {
        BasicStructure BB = new BasicStructure();

        BB.Planets="2";
        BB.Moon="2";
        BB.Stars="10";
        BB.Sun="1";
        System.out.println("Solar system is ready");

        FeatureSun Xros=new FeatureSun();
        Xros.Temp="12345";
        Xros.Color="green";
        Xros.Radius="34566miles";
        System.out.println("Feature sun added successfully");

        Planet1 migui=new Planet1();
        migui.color="white";
        migui.radius="12345miles";


    }
}
