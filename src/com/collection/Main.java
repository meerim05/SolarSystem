package com.collection;

public class Main {

    public static void main(String[] args) {
	SolarSystem FactorX = new SolarSystem();
	FactorX.Sun=1;
	FactorX.Moon=1;
	FactorX.Planets=2;

        //working on sun features
        Sun Feron = new Sun();
        Feron.Heat="46948214";
        Feron.Radius="34024209423";
        Feron.Temperature="1000000000000";


        Planet2 Pitaro = new Planet2();
        Pitaro.radius="12094894";
        Pitaro.size="very small";

        // adding features of Planet 1

        Planet1 Omaro = new Planet1();
        Omaro.radius="2428471470";
        Omaro.size="059107505950";

    }
}
