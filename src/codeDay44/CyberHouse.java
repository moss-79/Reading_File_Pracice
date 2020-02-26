        package codeDay44;
        public class CyberHouse{


                String design;
                int houseNum;

                static String neighbourhoodName;

                public CyberHouse(String design,int houseNum) {
                        this.design = design;
                        this.houseNum = houseNum;
                }


                public void showAllInfo(){
                        System.out.println(" Design: "+design+
                                "House number: "+houseNum+
                                " Neighbourhood Name: " +neighbourhoodName);

                }

                static void showNeighborhood(){
                        System.out.println(neighbourhoodName);
                }
        }