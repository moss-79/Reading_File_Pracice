package codeDay54;

import java.util.Arrays;
import java.util.List;
public class Utility2 {





        public static void main(String[] args) {


            Wearable w1 = new Clothes(32);
            Wearable w2 = new MakeUps();
            Wearable w3 = new Watch();
            Wearable w4 = new Perfume();

            List<Wearable> myList = Arrays.asList(w1, w2, w3, w4);

            for (Wearable each : myList) {

                each.wear();

            }


        }


    }

