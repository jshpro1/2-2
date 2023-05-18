/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import Management.StockManagement.Stock.Stock;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author ������
 */
public class Save_StockData {

    public Save_StockData(Stock stock) {
        try{
            Gson gs = new Gson();
            File file = new File("Stocks.json");
            FileWriter writer = new FileWriter(file);
        
            
            String fileWriter = gs.toJson(stock);

            writer.write(fileWriter);
            writer.flush();
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
