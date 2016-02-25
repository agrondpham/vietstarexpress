/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietstarexpress;

import com.vietstarexpress.bll.common.CentredBackgroundBorder;
import com.vietstarexpress.entities.Account;
import com.vietstarexpress.entities.Country;
import com.vietstarexpress.entities.Province;
import com.vietstarexpress.gui.Main;
import com.vietstarexpress.services.CountryService;
import com.vietstarexpress.services.AccountService;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;

/**
 *
 * @author Long
 */
public class vietstar {

    public static void main(String args[]) throws MalformedURLException, IOException {
        //EntityManagerFactory Emf=Persistence.createEntityManagerFactory("VietstarExpressPU");
        //init database
        Country c = new Country();
        c.setName("Vietnam");
        CountryService cs = new CountryService();
        cs.InsertOrUpdate(c);
        
        String[] provide = {"Hà Nội", "TP HCM", "Cần Thơ", "Đà Nẵng", "Hải Phòng", "An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Tĩnh", "Hải Dương", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Phú Yên"};
        Set<Province> sP = new HashSet<>();
        for (String name : provide) {
            Province p = new Province();
            p.setName(name);
            p.setCountry(c);
            cs.InsertAndUpdateProvince(p);
        }
        
        Account cc=new Account();
        cc.setUsername("123");
        AccountService as=new AccountService();
        as.InsertOrUpdate(cc);
        
        
        
        //set Notification for application
        URL url = new URL("http://vietstarexpress.com/public/files/slide/banner_1441165159.png");
        BufferedImage image = ImageIO.read(url);

        Main mainGui = new Main();
        mainGui.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainGui.getDesktopPane().setBorder(new CentredBackgroundBorder(image));
        mainGui.setVisible(true);

    }
}
