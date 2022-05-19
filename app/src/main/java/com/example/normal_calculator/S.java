package com.example.normal_calculator;

import android.util.Log;

public class S {
    public static final int Area = 1;
    public static final int Data = 2;
    public static final int Volume = 3;
    public static final int Discount = 4;
    public static final int Length = 5;
    public static final int Mass = 6;
    public static final int Numeral = 7;
    public static final int Speed = 8;
    public static final int Temperature = 9;
    public static final int Time = 10;

    static class area {
        public static final int km2 = 1;
        public static final int hectare = 2;
        public static final int m2 = 3;
        public static final int dm2 = 4;
        public static final int cm2 = 5;
        public static final int mm2 = 6;
        public static final int acre = 7;
        public static final int mile2 = 8;
        public static final int yard2 = 9;
        public static final int foot2 = 10;
        public static final int inch2 = 11;
        public static final int vigha = 12;

        public static final String km2tokm2 = "1";
        public static final String km2tohectare = "100";
        public static final String km2tom2 = "1000000";
        public static final String km2todm2 = "100000000";
        public static final String km2tocm2 = "10000000000";
        public static final String km2tomm2 = "1000000000000";
        public static final String km2toacre = "247.105";
        public static final String km2tomile2 = "0.386102";
        public static final String km2toyard2 = "1196000";
        public static final String km2tofoot2 = "10760000";
        public static final String km2toinch2 = "1550000000";
        public static final String km2tovigha = "617.7634539";

        public static final String hectaretokm2 = "0.01";
        public static final String hectaretohectare = "1";
        public static final String hectaretom2 = "10000";
        public static final String hectaretodm2 = "1000000";
        public static final String hectaretocm2 = "100000000";
        public static final String hectaretomm2 = "10000000000";
        public static final String hectaretoacre = "2.47105";
        public static final String hectaretomile2 = "0.00386102";
        public static final String hectaretoyard2 = "11959.9";
        public static final String hectaretofoot2 = "107639";
        public static final String hectaretoinch2 = "15500000";
        public static final String hectaretovigha = "6.177634539";

        public static final String m2tokm2 = "0.000001"; // 1E-6
        public static final String m2tohectare = "0.0001";
        public static final String m2tom2 = "1";
        public static final String m2todm2 = "100";
        public static final String m2tocm2 = "10000";
        public static final String m2tomm2 = "1000000";
        public static final String m2toacre = "0.000247105";
        public static final String m2tomile2 = "0.00386102";
        public static final String m2toyard2 = "1.19599";
        public static final String m2tofoot2 = "10.7639";
        public static final String m2toinch2 = "1550";
        public static final String m2tovigha = "0.0006177634539";

        public static final String dm2tokm2 = "0.00000001"; // 1E-8
        public static final String dm2tohectare = "0.000001"; //1E-6
        public static final String dm2tom2 = "0.01";
        public static final String dm2todm2 = "1";
        public static final String dm2tocm2 = "100";
        public static final String dm2tomm2 = "10000";
        public static final String dm2toacre = "0.00000247105";
        public static final String dm2tomile2 = "0.00000000386102"; // 3.861E-9
        public static final String dm2toyard2 = "0.0119599";
        public static final String dm2tofoot2 = "0.107639";
        public static final String dm2toinch2 = "15.5";
        public static final String dm2tovigha = "0.000006177634539";

        public static final String cm2tokm2 = "0.0000000001"; // 1E-10
        public static final String cm2tohectare = "0.00000001"; // 1E-8
        public static final String cm2tom2 = "0.0001";
        public static final String cm2todm2 = "0.01";
        public static final String cm2tocm2 = "1";
        public static final String cm2tomm2 = "100";
        public static final String cm2toacre = "0.0000000247105"; // 2.4711E-8
        public static final String cm2tomile2 = "0.0000000000386102"; // 3.861E-11
        public static final String cm2toyard2 = "0.000119599";
        public static final String cm2tofoot2 = "0.00107639";
        public static final String cm2toinch2 = "0.155";
        public static final String cm2tovigha = "0.00000006177634539";

        public static final String mm2tokm2 = "0.000000000001"; // 1E-12
        public static final String mm2tohectare = "0.0000000001"; // 1E-10
        public static final String mm2tom2 = "0.000001"; // 1E-6
        public static final String mm2todm2 = "0.0001";
        public static final String mm2tocm2 = "0.01";
        public static final String mm2tomm2 = "1";
        public static final String mm2toacre = "0.000000000247105"; // 2.4711E-10
        public static final String mm2tomile2 = "0.000000000000386102"; // 3.861E-13
        public static final String mm2toyard2 = "0.00000119599"; // 1.196E-6
        public static final String mm2tofoot2 = "0.0000107639"; // 1.0764E-5
        public static final String mm2toinch2 = "0.00155";
        public static final String mm2tovigha = "0.0000000006177634539";

        public static final String acretokm2 = "0.00404686";
        public static final String acretohectare = "0.404686";
        public static final String acretom2 = "4046.86";
        public static final String acretodm2 = "404686";
        public static final String acretocm2 = "40470000";
        public static final String acretomm2 = "4047000000";
        public static final String acretoacre = "1";
        public static final String acretomile2 = "0.0015625";
        public static final String acretoyard2 = "4840";
        public static final String acretofoot2 = "43560";
        public static final String acretoinch2 = "6276000";
        public static final String acretovigha = "2.5";

        public static final String mile2tokm2 = "2.59";
        public static final String mile2tohectare = "259";
        public static final String mile2tom2 = "2590000";
        public static final String mile2todm2 = "259000000";
        public static final String mile2tocm2 = "25900000000";
        public static final String mile2tomm2 = "2589988110336";
        public static final String mile2toacre = "640";
        public static final String mile2tomile2 = "1";
        public static final String mile2toyard2 = "3098000";
        public static final String mile2tofoot2 = "27880000";
        public static final String mile2toinch2 = "41014000000";
        public static final String mile2tovigha = "1600.008945";

        public static final String yard2tokm2 = "0.00000083612736"; // 8.3613E-7
        public static final String yard2tohectare = "0.000083612736"; // 8.3613E-5
        public static final String yard2tom2 = "0.836127";
        public static final String yard2todm2 = "83.6127";
        public static final String yard2tocm2 = "8361.27";
        public static final String yard2tomm2 = "836127";
        public static final String yard2toacre = "0.000206612";
        public static final String yard2tomile2 = "3.2283000";
        public static final String yard2toyard2 = "1";
        public static final String yard2tofoot2 = "9";
        public static final String yard2toinch2 = "1296";
        public static final String yard2tovigha = "0.000516528976";

        public static final String foot2tokm2 = "0.000000092903"; // 9.2903E-8
        public static final String foot2tohectare = "0.0000092903"; // 9.2903E-8
        public static final String foot2tom2 = "0.092303";
        public static final String foot2todm2 = "9.2903";
        public static final String foot2tocm2 = "929.03";
        public static final String foot2tomm2 = "93903";
        public static final String foot2toacre = "229570";
        public static final String foot2tomile2 = "0.00000003587"; // 3.587E-8
        public static final String foot2toyard2 = "0.111111";
        public static final String foot2tofoot2 = "1";
        public static final String foot2toinch2 = "144";
        public static final String foot2tovigha = "0.00005739210285";

        public static final String inch2tokm2 = "0.0000000006452"; // 2.491E-10
        public static final String inch2tohectare = "0.00000006452"; // 2.491E-8
        public static final String inch2tom2 = "0.00064516";
        public static final String inch2todm2 = "0.064516";
        public static final String inch2tocm2 = "6.4516";
        public static final String inch2tomm2 = "645.16";
        public static final String inch2toacre = "0.00000015942"; // 1.5942E-7
        public static final String inch2tomile2 = "0.0000000002491"; // 2.491E-10
        public static final String inch2toyard2 = "0.000771605";
        public static final String inch2tofoot2 = "0.00694444";
        public static final String inch2toinch2 = "1";
        public static final String inch2tovigha = "0.000000398557067";

        public static final String vighatokm2 = "0.001618742568";
        public static final String vighatohectare = "0.1618742568";
        public static final String vighatom2 = "1618.742568";
        public static final String vighatodm2 = "161874.2568";
        public static final String vighatocm2 = "16187425.68";
        public static final String vighatomm2 = "1618742568";
        public static final String vighatoacre = "0.4";
        public static final String vighatomile2 = "0.0006249965057";
        public static final String vighatoyard2 = "1935.999811";
        public static final String vighatofoot2 = "17424";
        public static final String vighatoinch2 = "2509050.981";
        public static final String vighatovigha = "1";
    }

    static class data {
        public static final int B = 1;
        public static final int KB = 2;
        public static final int MB = 3;
        public static final int GB = 4;
        public static final int TB = 5;
        public static final int PB = 6;

        public static final String B2B = "1";
        public static final String B2KB = "0.0009765625";
        public static final String B2MB = "0.00000095367431640625"; //  9.5367431640625e-7
        public static final String B2GB = "0.0000000009313225746154785"; //  9.313225746154785e-10
        public static final String B2TB = "0.0000000000009094947017729282"; //  9.094947017729282e-13
        public static final String B2PB = "0.0000000000000008881784197001252"; //  8.881784197001252e-16

        public static final String KB2B = "1024";
        public static final String KB2KB = "1";
        public static final String KB2MB = "0.0009765625";
        public static final String KB2GB = "0.00000095367431640625"; //  9.5367431640625e-7
        public static final String KB2TB = "0.0000000009313225746154785"; //  9.313225746154785e-10
        public static final String KB2PB = "0.0000000000009094947017729282"; //  9.094947017729282e-13

        public static final String MB2B = "1048576";
        public static final String MB2KB = "1024";
        public static final String MB2MB = "1";
        public static final String MB2GB = "0.0009765625";
        public static final String MB2TB = "0.00000095367431640625"; //  9.5367431640625e-7
        public static final String MB2PB = "0.0000000009313225746154785"; //  9.313225746154785e-10

        public static final String GB2B = "1073741824";
        public static final String GB2KB = "1048576";
        public static final String GB2MB = "1024";
        public static final String GB2GB = "1";
        public static final String GB2TB = "0.0009765625";
        public static final String GB2PB = "0.00000095367431640625"; //  9.5367431640625e-7

        public static final String TB2B = "1099511627776";
        public static final String TB2KB = "1073741824";
        public static final String TB2MB = "1048576";
        public static final String TB2GB = "1024";
        public static final String TB2TB = "1";
        public static final String TB2PB = "0.0009765625";

        public static final String PB2B = "1125899906842624";
        public static final String PB2KB = "1099511627776";
        public static final String PB2MB = "1073741824";
        public static final String PB2GB = "1048576";
        public static final String PB2TB = "1024";
        public static final String PB2PB = "1";
    }

    static class volume {
        public static final int m3 = 1;
        public static final int dm3 = 2;
        public static final int cm3 = 3;
        public static final int mm3 = 4;
        public static final int liter = 5;
        public static final int deciliter = 6;
        public static final int centiliter = 7;
        public static final int milliliter = 8;
        public static final int foot3 = 9;
        public static final int inch3 = 10;
        public static final int yard3 = 11;
        public static final int acrefoot = 12;

        public static final String m3tom3 = "1";
        public static final String m3todm3 = "1000";
        public static final String m3tocm3 = "1000000";
        public static final String m3tomm3 = "1000000000";
        public static final String m3toliter = "1000";
        public static final String m3todeciliter = "10000";
        public static final String m3tocentiliter = "100000";
        public static final String m3tomilliliter = "1000000";
        public static final String m3tofoot3 = "35.3147";
        public static final String m3toinch3 = "61023.7";
        public static final String m3toyard3 = "1.30795";
        public static final String m3toacrefoot = "0.000810714";

        public static final String dm3tom3 = "0.001";
        public static final String dm3todm3 = "1";
        public static final String dm3tocm3 = "1000";
        public static final String dm3tomm3 = "1000000";
        public static final String dm3toliter = "1";
        public static final String dm3todeciliter = "10";
        public static final String dm3tocentiliter = "100";
        public static final String dm3tomilliliter = "1000";
        public static final String dm3tofoot3 = "0.0353147";
        public static final String dm3toinch3 = "61.0237";
        public static final String dm3toyard3 = "0.00130795";
        public static final String dm3toacrefoot = "0.000000810714"; // 8.10714E-7

        public static final String cm3tom3 = "0.000001";
        public static final String cm3todm3 = "0.001";
        public static final String cm3tocm3 = "1";
        public static final String cm3tomm3 = "1000";
        public static final String cm3toliter = "0.001";
        public static final String cm3todeciliter = "0.01";
        public static final String cm3tocentiliter = "0.1";
        public static final String cm3tomilliliter = "1";
        public static final String cm3tofoot3 = "0.0000353147"; // 3.53147E-5
        public static final String cm3toinch3 = "0.0610237";
        public static final String cm3toyard3 = "0.00000130795"; // 1.30795E-6
        public static final String cm3toacrefoot = "0.000000000810714"; // 8.10714E-10

        public static final String mm3tom3 = "0.000000001";
        public static final String mm3todm3 = "0.000001";
        public static final String mm3tocm3 = "0.001";
        public static final String mm3tomm3 = "1";
        public static final String mm3toliter = "0.000001";
        public static final String mm3todeciliter = "0.00001";
        public static final String mm3tocentiliter = "0.0001";
        public static final String mm3tomilliliter = "0.001";
        public static final String mm3tofoot3 = "0.000000353147"; // 3.53147E-8
        public static final String mm3toinch3 = "0.0000610237"; // 6.10237E-5
        public static final String mm3toyard3 = "0.00000000130795"; // 1.30795E-9
        public static final String mm3toacrefoot = "0.000000000000810714"; // 8.10714E-13

        public static final String litertom3 = "0.001";
        public static final String litertodm3 = "1";
        public static final String litertocm3 = "1000";
        public static final String litertomm3 = "1000000";
        public static final String litertoliter = "1";
        public static final String litertodeciliter = "10";
        public static final String litertocentiliter = "100";
        public static final String litertomilliliter = "1000";
        public static final String litertofoot3 = "0.0353147";
        public static final String litertoinch3 = "61.0237";
        public static final String litertoyard3 = "0.001307795";
        public static final String litertoacrefoot = "0.000000810714"; // 8.10714E-7

        public static final String decilitertom3 = "0.0001";
        public static final String decilitertodm3 = "0.1";
        public static final String decilitertocm3 = "100";
        public static final String decilitertomm3 = "100000";
        public static final String decilitertoliter = "0.1";
        public static final String decilitertodeciliter = "1";
        public static final String decilitertocentiliter = "10";
        public static final String decilitertomilliliter = "100";
        public static final String decilitertofoot3 = "0.00353147";
        public static final String decilitertoinch3 = "6.10237";
        public static final String decilitertoyard3 = "0.000130795";
        public static final String decilitertoacrefoot = "0.0000000810714"; // 8.10714E-8

        public static final String centilitertom3 = "0.00001";
        public static final String centilitertodm3 = "0.01";
        public static final String centilitertocm3 = "10";
        public static final String centilitertomm3 = "10000";
        public static final String centilitertoliter = "0.01";
        public static final String centilitertodeciliter = "0.1";
        public static final String centilitertocentiliter = "1";
        public static final String centilitertomilliliter = "10";
        public static final String centilitertofoot3 = "0.000353147";
        public static final String centilitertoinch3 = "0.610237";
        public static final String centilitertoyard3 = "0.0000130795"; // 1.30795E-5
        public static final String centilitertoacrefoot = "0.00000000810714"; // 8.10714E-9

        public static final String millilitertom3 = "0.000001";
        public static final String millilitertodm3 = "0.001";
        public static final String millilitertocm3 = "1";
        public static final String millilitertomm3 = "1000";
        public static final String millilitertoliter = "0.001";
        public static final String millilitertodeciliter = "0.01";
        public static final String millilitertocentiliter = "0.1";
        public static final String millilitertomilliliter = "1";
        public static final String millilitertofoot3 = "0.0000353147";
        public static final String millilitertoinch3 = "0.0610237";
        public static final String millilitertoyard3 = "0.0000130795"; // 1.30795E-6
        public static final String millilitertoacrefoot = "0.000000000810714"; // 8.10714E-10

        public static final String foot3tom3 = "0.0283168";
        public static final String foot3todm3 = "28.3168";
        public static final String foot3tocm3 = "28316.8";
        public static final String foot3tomm3 = "28136800";
        public static final String foot3toliter = "28.3168";
        public static final String foot3todeciliter = "283.168";
        public static final String foot3tocentiliter = "2831.68";
        public static final String foot3tomilliliter = "28316.8";
        public static final String foot3tofoot3 = "1";
        public static final String foot3toinch3 = "1728";
        public static final String foot3toyard3 = "0.037037";
        public static final String foot3toacrefoot = "0.0000229569"; // 2.29569E-5

        public static final String inch3tom3 = "0.000016287"; // 1.6387E-5
        public static final String inch3todm3 = "0.0163871";
        public static final String inch3tocm3 = "16.3871";
        public static final String inch3tomm3 = "16387.1";
        public static final String inch3toliter = "0.0163871";
        public static final String inch3todeciliter = "0.163871";
        public static final String inch3tocentiliter = "1.63871";
        public static final String inch3tomilliliter = "16.3871";
        public static final String inch3tofoot3 = "0.000578704";
        public static final String inch3toinch3 = "1";
        public static final String inch3toyard3 = "0.0000214335"; // 2.14335E-5
        public static final String inch3toacrefoot = "0.000000132852"; // 1.32852E-8

        public static final String yard3tom3 = "0.764555";
        public static final String yard3todm3 = "764.555";
        public static final String yard3tocm3 = "764555";
        public static final String yard3tomm3 = "764600000";
        public static final String yard3toliter = "764.555";
        public static final String yard3todeciliter = "7645.55";
        public static final String yard3tocentiliter = "76455.5";
        public static final String yard3tomilliliter = "764555";
        public static final String yard3tofoot3 = "27";
        public static final String yard3toinch3 = "46656";
        public static final String yard3toyard3 = "1";
        public static final String yard3toacrefoot = "0.000619836";

        public static final String acrefoottom3 = "1233.48";
        public static final String acrefoottodm3 = "1233000";
        public static final String acrefoottocm3 = "1233000000";
        public static final String acrefoottomm3 = "1233000000000";
        public static final String acrefoottoliter = "1233000";
        public static final String acrefoottodeciliter = "1230000";
        public static final String acrefoottocentiliter = "123300000";
        public static final String acrefoottomilliliter = "1233000000";
        public static final String acrefoottofoot3 = "43559.9";
        public static final String acrefoottoinch3 = "75270000";
        public static final String acrefoottoyard3 = "1613.33";
        public static final String acrefoottoacrefoot = "1";
    }

    static class length {
        public static final int km = 1;
        public static final int m = 2;
        public static final int dm = 3;
        public static final int cm = 4;
        public static final int mm = 5;
        public static final int nm = 6;
        public static final int mile = 7;
        public static final int yard = 8;
        public static final int foot = 9;
        public static final int inch = 10;
        public static final int lightyear = 11;

        public static final String kmtokm = "1";
        public static final String kmtom = "1000";
        public static final String kmtodm = "10000";
        public static final String kmtocm = "100000";
        public static final String kmtomm = "1000000";
        public static final String kmtonm = "1000000000000";
        public static final String kmtomile = "0.621371192";
        public static final String kmtoyard = "1093.6133";
        public static final String kmtofoot = "3280.8399";
        public static final String kmtoinch = "39370.0787";
        public static final String kmtolightyear = "0.000000000000105702341"; // 1.05702341E-13

        public static final String mtokm = "0.001";
        public static final String mtom = "1";
        public static final String mtodm = "10";
        public static final String mtocm = "100";
        public static final String mtomm = "1000";
        public static final String mtonm = "1000000000";
        public static final String mtomile = "0.000621371192";
        public static final String mtoyard = "1.0936133";
        public static final String mtofoot = "3.2808399";
        public static final String mtoinch = "39.3700787";
        public static final String mtolightyear = "0.000000000000000105702341"; // 1.05702341E-16

        public static final String dmtokm = "0.0001";
        public static final String dmtom = "0.1";
        public static final String dmtodm = "1";
        public static final String dmtocm = "10";
        public static final String dmtomm = "100";
        public static final String dmtonm = "100000000";
        public static final String dmtomile = "0.0000621371192";
        public static final String dmtoyard = "0.10936133";
        public static final String dmtofoot = "0.32808399";
        public static final String dmtoinch = "3.93700787";
        public static final String dmtolightyear = "0.0000000000000000105702341"; // 1.05702341E-17

        public static final String cmtokm = "0.00001";
        public static final String cmtom = "0.01";
        public static final String cmtodm = "0.1";
        public static final String cmtocm = "1";
        public static final String cmtomm = "10";
        public static final String cmtonm = "10000000";
        public static final String cmtomile = "0.00000621371192";
        public static final String cmtoyard = "0.010936133";
        public static final String cmtofoot = "0.032808399";
        public static final String cmtoinch = "0.393700787";
        public static final String cmtolightyear = "0.00000000000000000105702341"; // 1.05702341E-18

        public static final String mmtokm = "0.000001";
        public static final String mmtom = "0.001";
        public static final String mmtodm = "0.01";
        public static final String mmtocm = "0.1";
        public static final String mmtomm = "1";
        public static final String mmtonm = "1000000";
        public static final String mmtomile = "0.000000621371192";
        public static final String mmtoyard = "0.0010936133";
        public static final String mmtofoot = "0.0032808399";
        public static final String mmtoinch = "0.0393700787";
        public static final String mmtolightyear = "0.000000000000000000105702341"; // 1.05702341E-19

        public static final String nmtokm = "0.000000000001";
        public static final String nmtom = "0.000000001";
        public static final String nmtodm = "0.00000001";
        public static final String nmtocm = "0.0000001";
        public static final String nmtomm = "0.000001";
        public static final String nmtonm = "1";
        public static final String nmtomile = "0.000000000000621371192";
        public static final String nmtoyard = "0.0000000010936133";
        public static final String nmtofoot = "0.0000000032808399";
        public static final String nmtoinch = "0.0000000393700787";
        public static final String nmtolightyear = "0.000000000000000000000000105702341"; // 1.05702341E-25

        public static final String miletokm = "1.609344";
        public static final String miletom = "1609.344";
        public static final String miletodm = "16093.44";
        public static final String miletocm = "160934.4";
        public static final String miletomm = "1609344";
        public static final String miletonm = "1609344000000";
        public static final String miletomile = "1";
        public static final String miletoyard = "1760";
        public static final String miletofoot = "5280";
        public static final String miletoinch = "63360";
        public static final String miletolightyear = "0.000000000000170111428"; // 1.70111428e-13

        public static final String yardtokm = "0.0009144";
        public static final String yardtom = "0.9144";
        public static final String yardtodm = "9.144";
        public static final String yardtocm = "91.44";
        public static final String yardtomm = "914.4";
        public static final String yardtonm = "91440000";
        public static final String yardtomile = "0.000568181818";
        public static final String yardtoyard = "1";
        public static final String yardtofoot = "3";
        public static final String yardtoinch = "36";
        public static final String yardtolightyear = "0.0000000000000000966542207"; // 9.66542207e-17

        public static final String foottokm = "0.0003048";
        public static final String foottom = "0.3048";
        public static final String foottodm = "3.048";
        public static final String foottocm = "30.48";
        public static final String foottomm = "304.8";
        public static final String foottonm = "304800000";
        public static final String foottomile = "0.000189393939";
        public static final String foottoyard = "0.333333333333";
        public static final String foottofoot = "1";
        public static final String foottoinch = "12";
        public static final String foottolightyear = "0.0000000000000000322180736"; // 3.22180736e-17

        public static final String inchtokm = "0.0000254";
        public static final String inchtom = "0.0254";
        public static final String inchtodm = "0.254";
        public static final String inchtocm = "2.54";
        public static final String inchtomm = "25.4";
        public static final String inchtonm = "25400000";
        public static final String inchtomile = "0.0000157828283"; // 1.57828283e-5
        public static final String inchtoyard = "0.0277777778";
        public static final String inchtofoot = "0.0833333333";
        public static final String inchtoinch = "1";
        public static final String inchtolightyear = "0.00000000000000000268483946"; // 2.68483946e-18

        public static final String lightyeartokm = "9460528400000";
        public static final String lightyeartom = "9460528400000000";
        public static final String lightyeartodm = "94605284000000000";
        public static final String lightyeartocm = "946052840000000000";
        public static final String lightyeartomm = "9460528400000000000";
        public static final String lightyeartonm = "9460528400000000000000000";
        public static final String lightyeartomile = "5878499810000";
        public static final String lightyeartoyard = "10346159700000000";
        public static final String lightyeartofoot = "31038479000000000";
        public static final String lightyeartoinch = "372461748000000000";
        public static final String lightyeartolightyear = "1";
    }

    static class mass {
        public static final int tonne = 1;
        public static final int kg = 2;
        public static final int gram = 3;
        public static final int mg = 4;
        public static final int quintal = 5;
        public static final int pound = 6;
        public static final int ounce = 7;
        public static final int carat = 8;
        public static final int grain = 9;

        public static final String tonnetotonne = "1";
        public static final String tonnetokg = "1000";
        public static final String tonnetogram = "1000000";
        public static final String tonnetomg = "1000000000";
        public static final String tonnetoquintal = "10";
        public static final String tonnetopound = "2204.623";
        public static final String tonnetoounce = "0.621371192";
        public static final String tonnetocarat = "5000000";
        public static final String tonnetograin = "15430000";

        public static final String kgtotonne = "0.001";
        public static final String kgtokg = "1";
        public static final String kgtogram = "1000";
        public static final String kgtomg = "1000000";
        public static final String kgtoquintal = "0.01";
        public static final String kgtopound = "2.204623";
        public static final String kgtoounce = "35.27396";
        public static final String kgtocarat = "5000";
        public static final String kgtograin = "15432.4";

        public static final String gramtotonne = "0.000001";
        public static final String gramtokg = "0.001";
        public static final String gramtogram = "1";
        public static final String gramtomg = "1000";
        public static final String gramtoquintal = "0.00001";
        public static final String gramtopound = "0.002205";
        public static final String gramtoounce = "0.035274";
        public static final String gramtocarat = "5";
        public static final String gramtograin = "15.4324";

        public static final String mgtotonne = "0.000000001";
        public static final String mgtokg = "0.000001";
        public static final String mgtogram = "0.001";
        public static final String mgtomg = "1";
        public static final String mgtoquintal = "0.0000001";
        public static final String mgtopound = "0.000002";
        public static final String mgtoounce = "0.0000035";
        public static final String mgtocarat = "0.005";
        public static final String mgtograin = "0.0154324";

        public static final String quintaltotonne = "0.1";
        public static final String quintaltokg = "100";
        public static final String quintaltogram = "100000";
        public static final String quintaltomg = "100000000";
        public static final String quintaltoquintal = "1";
        public static final String quintaltopound = "220.462";
        public static final String quintaltoounce = "3527.4";
        public static final String quintaltocarat = "500000";
        public static final String quintaltograin = "1543000";

        public static final String poundtotonne = "0.000454";
        public static final String poundtokg = "0.453592";
        public static final String poundtogram = "453.5924";
        public static final String poundtomg = "453592.4";
        public static final String poundtoquintal = "0.00453592";
        public static final String poundtopound = "1";
        public static final String poundtoounce = "16";
        public static final String poundtocarat = "2267.962";
        public static final String poundtograin = "7000";

        public static final String ouncetotonne = "0.000028";
        public static final String ouncetokg = "0.02835";
        public static final String ouncetogram = "28.34952";
        public static final String ouncetomg = "28249.52";
        public static final String ouncetoquintal = "0.000283495";
        public static final String ouncetopound = "0.0625";
        public static final String ouncetoounce = "1";
        public static final String ouncetocarat = "141.7476";
        public static final String ouncetograin = "437.5";

        public static final String carattotonne = "0.0000002";
        public static final String carattokg = "0.0002";
        public static final String carattogram = "0.2";
        public static final String carattomg = "200";
        public static final String carattoquintal = "0.000002";
        public static final String carattopound = "0.000441";
        public static final String carattoounce = "0.007055";
        public static final String carattocarat = "1";
        public static final String carattograin = "3.08647";

        public static final String graintotonne = "0.000000064799";
        public static final String graintokg = "0.000064799";
        public static final String graintogram = "0.0647989";
        public static final String graintomg = "64.7989";
        public static final String graintoquintal = "0.000000647989";
        public static final String graintopound = "0.000142857";
        public static final String graintoounce = "0.00228571";
        public static final String graintocarat = "0.323995";
        public static final String graintograin = "1";
    }

    static class numeral {
        public static final int binary = 1;
        public static final int octal = 2;
        public static final int decimal = 3;
        public static final int hexdecimal = 4;
    }

    static class speed {
        public static final int light = 1;
        public static final int ms = 2;
        public static final int kmh = 3;
        public static final int mph = 4;
        public static final int footps = 5;
        public static final int inchps = 6;

        public static final String LightSpeedtoLightSpeed = "1";
        public static final String LightSpeedtoms = "299800000";
        public static final String LightSpeedtokmh = "1079000000";
        public static final String LightSpeedtomph = "670600000";
        public static final String LightSpeedtofootps = "983600000";
        public static final String LightSpeedtoinchps = "11800000000";

        public static final String mstoLightSpeed = "0.0000000033356"; // 3.33356E-9
        public static final String mstoms = "1";
        public static final String mstokmh = "3.6";
        public static final String mstomph = "2.23694";
        public static final String mstofootps = "3.28084";
        public static final String mstoinchps = "39.3701";

        public static final String kmhtoLightSpeed = "0.00000000092657"; // 9.2657E-10
        public static final String kmhtoms = "0.277778";
        public static final String kmhtokmh = "1";
        public static final String kmhtomph = "0.621371";
        public static final String kmhtofootps = "0.911344";
        public static final String kmhtoinchps = "10.9361";

        public static final String mphtoLightSpeed = "0.0000000014912"; // 1.4912E-9
        public static final String mphtoms = "0.44704";
        public static final String mphtokmh = "1.60934";
        public static final String mphtomph = "1";
        public static final String mphtofootps = "1.46667";
        public static final String mphtoinchps = "17.6";

        public static final String footpstoLightSpeed = "0.0000000010167"; // 1.0167E-9
        public static final String footpstoms = "0.3048";
        public static final String footpstokmh = "1.09728";
        public static final String footpstomph = "0.681818";
        public static final String footpstofootps = "1";
        public static final String footpstoinchps = "12";

        public static final String inchpstoLightSpeed = "0.000000000084725"; // 8.4725E-11
        public static final String inchpstoms = "0.0254";
        public static final String inchpstokmh = "0.09144";
        public static final String inchpstomph = "0.0568182";
        public static final String inchpstofootps = "0.08333333";
        public static final String inchpstoinchps = "1";
    }

    static class temperature {
        public static final int c = 1;
        public static final int f = 2;
        public static final int k = 3;

        public static String ktof(String s) {
            return String.valueOf(((Double.parseDouble(s) - 273.15) * 1.8) + 32);
        }

        public static String ktoc(String s) {
            return String.valueOf(Double.parseDouble(s) - 273.15);
        }

        public static String ftok(String s) {
            return String.valueOf((Double.parseDouble(s) * 0.5556) + 255.3722);
        }

        public static String ftoc(String s) {
            Log.i("data", "value of focused textview is " + s);
            return String.valueOf((Double.parseDouble(s) - 32) * (5.0 / 9.0));
        }

        public static String ctok(String s) {
            return String.valueOf(Double.parseDouble(s) + 273.15);
        }

        public static String ctof(String s) {
            return String.valueOf((Double.parseDouble(s) * 1.8) + 32);
        }
    }

    static class time {
        public static final int year = 1;
        public static final int month = 2;
        public static final int day = 3;
        public static final int hour = 4;
        public static final int minute = 5;
        public static final int second = 6;
        public static final int millis = 7;
        public static final int micros = 8;
        public static final int picos = 9;
    }
}
