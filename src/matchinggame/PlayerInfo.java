/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchinggame;

import java.io.Serializable;

/**
 *
 * @author YorickDigsGraves
 */
public class PlayerInfo implements Serializable{
    String pName = "";
    int key = 0;
    int point = 0;
    int sec = 0;
    
    PlayerInfo(String pn, int k)
    {
        pName = pn;
        key = k;
    }
    PlayerInfo()
    {
        
    }
}
