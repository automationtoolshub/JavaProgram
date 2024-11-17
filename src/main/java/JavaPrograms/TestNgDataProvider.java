package JavaPrograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestNgDataProvider {

   @Test(dataProvider="getData2")
    public void retrieveData(String username,String password,String appName){
        if(appName.equalsIgnoreCase("Facebook")){
            System.out.println("open the facebook url");
        }
        if(appName.equalsIgnoreCase("twitter")){
            System.out.println("open the twitter url");
        }
        System.out.println("UserName==="+username);
        System.out.println("Password==="+password);
        System.out.println("Password==="+appName);
    }
    @DataProvider(name="getData1")
    public Object[] loadData1(){
        Object[][] data = new Object[2][3];
        data[0][0]= "karthik";
        data[0][1]= "passworkd1";
        data[0][2]= "faceBook";
        data[1][0]="kannan";
        data[1][1]="Password2";
        data[1][2]="twitter";
        return data;
    }

    @DataProvider(name="getData2")
    public Object[][] loadData2(){
        Object[][] data  = new Object[][]{{"karthikkkkkk","password1","facebook"},{"varshan","password12","twitter"}};
        return data;
    }

    @DataProvider(name="getData3")
    public Iterator<Object[]> loadData3(){
        List<Object[]> l = new ArrayList<>();
        l.add(new Object[]{"karthik","password1","facebook"});
        l.add(new Object[]{"kava","password13","twitter"});
        return l.iterator();
    }

    @DataProvider(name="getData4")
    public Object[] loadData4(){
        Object[][] data  = {{"karthik","password1","facebook"}};
        return data;
    }
}