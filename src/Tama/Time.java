package Tama;
import java.lang.String;
import java.util.Date;
import java.text.Format;
import java.text.SimpleDateFormat;

public class Time
{
        private Date time;
        private String season;
        private boolean dayTime; // 0 for night and 1 for day
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = new String(formatter.format(new Date()));

        /*************************************\
        /       Setters an Getters            /
        \*************************************/

        public Date getTime()
        {
                return time;
        }

        public String getSeason()
        {
                return season;
        }

        public boolean getDayTime()
        {
                return dayTime;
        }
                /*************************************\
                /            Fonctions                /
                \*************************************/


        public String changeSeason()
        {
  
                if (date.substring(5,7).equals("3"))
                {
                        if (date.substring(8,10).equals("21"))
                        {
                                season = "Spring";          
                        }     
                }
                
                if (date.substring(5,7).equals("6"))
                {
                        if (date.substring(8,10).equals("21"))
                        {
                            season = "Summer";          
                        }     
                }
                
                if (date.substring(5,7).equals("9"))
                {
                        if (date.substring(8,10).equals("21"))
                        {
                            season = "Automn";          
                        }     
                }

                if (date.substring(5,7).equals("12"))
                {
                        if (date.substring(8,10).equals("21"))
                        {
                            season = "Winter";          
                        }     
                }
                return season;
        }

        public void changeDayTime()
        {          

                if (date.substring(11,13).compareTo("32")<0) 
                {
                        System.out.println("yo");
                }
               
                else if (date.substring(11,13).compareTo("32")>0)
                {
                        System.out.println("yoyo");
                }
                else
                {
                        System.out.println("yoyoyo");
                }
        }  

}
