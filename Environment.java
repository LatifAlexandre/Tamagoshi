import java.util.ArrayList;
import java.lang.String;


public class Environment
{
        private string name;
        private String fileName;
        private ArrayList<String> objects = new ArrayList<String>();
        private boolean isUsable;

        public String getName()
        {
                return name;
        }

        private boolean canIUseIt(Element e)
        {
                if ( objects.isEmpty() ){
                        return false;
                }
                else{
                        
                        for (String object : objects)
                        {
                                if ( object == e.getName() )
                                {
                                        return true;
                                }
                        }
                
                return false;
                }
                
                //OR return contains (e.getName());
        }











}
