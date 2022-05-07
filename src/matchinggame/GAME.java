/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchinggame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author YorickDigsGraves
 */
public class GAME extends javax.swing.JFrame {

    /**
     * Creates new form GAME
     */
    int count = 0, check = 1, p = 0, q = 0, x, cc = 100;
    int secCount = 30, c = 1;
    int secCheck = 0;
    int point, secleft;
    int bounty = 0, power = 0, bountycheck = 0;

    ArrayList<PlayerInfo> hold = new ArrayList<>();
    FileInputStream fis;
    ObjectInputStream ois;

    FileOutputStream fos;
    ObjectOutputStream oos;

    //int image[] = {1,0,3,2,4,1,3,0,4,2};
    int image[] = new int[10];
    int checkimage[] = new int[10];

    public GAME() {
        initComponents();

        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);

        for (int i = 0; i < checkimage.length; i++) {
            checkimage[i] = 0;

        }

        ggwp();

        System.err.println("here start");

    }

    void ggwp() {
        Random rand = new Random();

        for (int i = 0; i < image.length; i++) {
            image[i] = 10;
        }

        for (int i = 0; i < image.length; i++) {

            while (true) {
                int co = 0;
                int mew = rand.nextInt(5);

                for (int j = 0; j < image.length; j++) {
                    if (mew == image[j]) {
                        co++;
                    }
                }
                if (co == 1 || co == 0) {
                    image[i] = mew;
                    break;
                }
                //System.out.println("in random check");
            }
        }
        for (int i : image) {
            System.out.print(i + " ");
        }
        System.out.println("");

//        int image[] = new int[10];
//        Random rand = new Random();
//
//        int types = 0, i, du = 2;
//
//        while (types < 3) {
//            types = rand.nextInt(5) + 1;
//        }
//
//        System.out.println("types = " + types);
//
//        for (i = 0; i < image.length; i++) {
//            image[i] = 10;
//        }
//
//        for (i = 0; i < image.length; i++) {
//
//            if (i == (types * 2)) {
//                break;
//            }
//
//            while (true) {
//                int co = 0;
//                System.out.println("i = " + i);
//                int mew = rand.nextInt(types);
//                System.out.println("mew = " + mew);
//
//                for (int j = 0; j < image.length; j++) {
//                    if (mew == image[j]) {
//                        co++;
//                    }
//                }
//                if (co == 1 || co == 0) {
//                    image[i] = mew;
//                    break;
//                }
//
//                System.out.println("in random check");
//            }
//        }
//        for (; i < image.length; i += 2) {
//            int aftermew = rand.nextInt(types);
//
//            int checkindex = rand.nextInt(10);
//
//            du = 2;
//
//            while (du > 0) {
//                for (int j = 0; j < image.length; j++) {
//
//                    if (image[j] == 10) {
//                        image[j] = aftermew;
//                    }
//                }
//
//                du--;
//            }
//        }
//
//        for (int j : image) {
//            System.out.print(j + " ");
//        }
//        System.out.println("");
    }

    void preStart() throws InterruptedException {
//        System.out.println("I am here");
//        //TimeUnit.SECONDS.sleep(1);
//        System.out.println("before before stop");
//        for(int i = 0; i < image.length; i++)
//        {
//            System.err.println("Here again");
//            int n = image[i]+1;
//            String h = n+ ".jpg";
//            
//                    if(i == 0)
//                    {
//                        jButton2.setIcon(new ImageIcon(Class.class.getResource("/resources/"+h)));
//                    }
//                    else if(i == 1)
//                    {
//                        jButton3.setIcon(new ImageIcon(Class.class.getResource("/resources/"+h)));
//                    }
//                    else if(i == 2)
//                    {
//                        jButton4.setIcon(new ImageIcon(Class.class.getResource("/resources/"+h)));
//                    }
//                    else if(i == 3)
//                    {
//                        jButton5.setIcon(new ImageIcon(Class.class.getResource("/resources/"+h)));
//                    }
//                    else if(i == 4)
//                    {
//                        jButton6.setIcon(new ImageIcon(Class.class.getResource("/resources/"+h)));
//                    }
//                    else if(i == 5)
//                    {
//                        jButton7.setIcon(new ImageIcon(Class.class.getResource("/resources/"+h)));
//                    }
//                    else if(i == 6)
//                    {
//                        jButton8.setIcon(new ImageIcon(Class.class.getResource("/resources/"+h)));
//                    }
//                    else if(i == 7)
//                    {
//                        jButton9.setIcon(new ImageIcon(Class.class.getResource("/resources/"+h)));
//                    }
//                    else if(i == 8)
//                    {
//                        jButton10.setIcon(new ImageIcon(Class.class.getResource("/resources/"+h)));
//                    }
//                    else if(i == 9)
//                    {
//                        jButton11.setIcon(new ImageIcon(Class.class.getResource("/resources/"+h)));
//                    }
//                    //TimeUnit.SECONDS.sleep(1);
//        }

        System.out.println("before stop");

        //TimeUnit.SECONDS.sleep(10);
        timee.start();
        //timee.join();

//        jButton2.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
//        jButton3.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
//        jButton4.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
//        jButton5.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
//        jButton6.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
//        jButton7.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
//        jButton8.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
//        jButton9.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
//        jButton10.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
//        jButton11.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
        //meow.start();
        return;
    }

    void start() throws InterruptedException {
        preStart();
        System.err.println("here");
        //meow.start();
    }

    void end() throws Exception {
        UIManager.put("OptionPane.messageFont", new Font("Tahoma", Font.BOLD, 14));

        JOptionPane.showMessageDialog(null, "YOU WON");
        finalend();
        System.out.println("SecCount = " + secCount);
        meow.stop();

    }

    void finalend() throws Exception {

        fis = new FileInputStream("playerinfo.txt");
        ois = new ObjectInputStream(fis);

        hold = (ArrayList<PlayerInfo>) ois.readObject();

        for (int i = 0; i < hold.size(); i++) {
            if (hold.get(i).key == 1) {

                int xz = 30 - secCount;
                hold.get(i).sec = xz;

                if (xz == 0) {
                    hold.get(i).point = (10 * 2) + (30 * 6);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 1) {
                    hold.get(i).point = (10 * 2) + (29 * 6);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 2) {
                    hold.get(i).point = (10 * 2) + (28 * 6);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 3) {
                    hold.get(i).point = (10 * 2) + (27 * 6);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 4) {
                    hold.get(i).point = (10 * 2) + (26 * 6);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 5) {
                    hold.get(i).point = (10 * 2) + (25 * 5);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 6) {
                    hold.get(i).point = (10 * 2) + (24 * 5);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 7) {
                    hold.get(i).point = (10 * 2) + (23 * 5);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 8) {
                    hold.get(i).point = (10 * 2) + (22 * 5);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 9) {
                    hold.get(i).point = (10 * 2) + (21 * 5);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 10) {
                    hold.get(i).point = (10 * 2) + (20 * 5);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 11) {
                    hold.get(i).point = (10 * 2) + (19 * 4);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 12) {
                    hold.get(i).point = (10 * 2) + (18 * 4);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 13) {
                    hold.get(i).point = (10 * 2) + (17 * 4);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 14) {
                    hold.get(i).point = (10 * 2) + (16 * 4);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 15) {
                    hold.get(i).point = (10 * 2) + (15 * 4);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 16) {
                    hold.get(i).point = (10 * 2) + (14 * 4);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 17) {
                    hold.get(i).point = (10 * 2) + (13 * 3);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 18) {
                    hold.get(i).point = (10 * 2) + (12 * 3);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 19) {
                    hold.get(i).point = (10 * 2) + (11 * 3);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 20) {
                    hold.get(i).point = (10 * 2) + (10 * 3);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 21) {
                    hold.get(i).point = (10 * 2) + (9 * 3);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 22) {
                    hold.get(i).point = (10 * 2) + (8 * 3);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 23) {
                    hold.get(i).point = (10 * 2) + (7 * 2);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 24) {
                    hold.get(i).point = (10 * 2) + (6 * 2);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 25) {
                    hold.get(i).point = (10 * 2) + (5 * 2);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 26) {
                    hold.get(i).point = (10 * 2) + (4 * 2);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 27) {
                    hold.get(i).point = (10 * 2) + (3 * 1);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 28) {
                    hold.get(i).point = (10 * 2) + (2 * 1);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 29) {
                    hold.get(i).point = (10 * 2) + (1 * 1);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                } else if (xz == 30) {
                    hold.get(i).point = (power * 2) + (0 * 0);
                    if (bountycheck == 1) {
                        hold.get(i).point += 300;
                    }
                }

                fos = new FileOutputStream("playerinfo.txt");
                oos = new ObjectOutputStream(fos);
                oos.writeObject(hold);
                oos.flush();
                oos.close();
                fos.close();

                try {
                    ois.close();
                    fis.close();
                } catch (IOException xyz) {
                    xyz.getMessage();
                }
                break;
            }
        }

        aftermatchHS yu = new aftermatchHS();
        yu.setVisible(true);
        this.dispose();
        //sec.stop();
    }

    void endthisfag() throws InterruptedException {
        //timee.join();
        System.out.println("before suspand");
        //timee.suspend();
        //timee.wait();

        System.out.println("asd");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("dsa");

        // timee.resume();
        //timee.notify();
        meow.start();
        sec.start();

        return;
    }

    void ENDTHISFAG() {
        jButton2.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
        jButton3.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
        jButton4.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
        jButton5.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
        jButton6.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
        jButton7.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
        jButton8.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
        jButton9.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
        jButton10.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
        jButton11.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));

        timee.stop();

    }

    void grandFinally() {
        System.out.println("before end");

        jLabel2.setText("0");
        jLabel2.setForeground(Color.red);

        sec.stop();
        System.out.println("after end");
    }

    void minus() {
        secCount--;
        String copy2 = Integer.toString(secCount);

        if (secCount <= 15) {
            jLabel2.setForeground(Color.red);
        } else {
            jLabel2.setForeground(Color.DARK_GRAY);
        }
        jLabel2.setText(copy2);

    }

    Thread sec = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                c = 1;
                secCount--;

                System.out.println("secCount = " + secCount);
                String copy = Integer.toString(secCount);

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (c == 1) {
                    System.out.println("before sec++");
                    if (secCount <= 15) {
                        jLabel2.setForeground(Color.red);
                    } else {
                        jLabel2.setForeground(Color.DARK_GRAY);
                    }

                    jLabel2.setText(copy);

                } else if (c == 2) {
                    minus();
                }

                if (secCount < 0 || secCount <= 0) {
                    System.out.println("hello sec");
                    break;
                }

                if (secCheck == 1) {
                    //break;
                    System.out.println("++sec");
                    secCount++;

                    System.out.println("secCount = " + secCount);
                    copy = Integer.toString(secCount);
                    if (secCount <= 15) {
                        jLabel2.setForeground(Color.red);
                    } else {
                        jLabel2.setForeground(Color.DARK_GRAY);
                    }
                    jLabel2.setText(copy);
                    sec.stop();
                }

            }

//            if(secCheck == 1)
//            {
//                sec.stop();
//            }
            grandFinally();
        }

    });

    Thread timee = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < image.length; i++) {
                System.err.println("Here again");
                int n = image[i] + 1;
                System.out.println("n = " + n);
                String h = n + ".jpg";

                if (i == 0) {
                    jButton2.setIcon(new ImageIcon(Class.class.getResource("/resources/" + h)));
                } else if (i == 1) {
                    jButton3.setIcon(new ImageIcon(Class.class.getResource("/resources/" + h)));
                } else if (i == 2) {
                    jButton4.setIcon(new ImageIcon(Class.class.getResource("/resources/" + h)));
                } else if (i == 3) {
                    jButton5.setIcon(new ImageIcon(Class.class.getResource("/resources/" + h)));
                } else if (i == 4) {
                    jButton6.setIcon(new ImageIcon(Class.class.getResource("/resources/" + h)));
                } else if (i == 5) {
                    jButton7.setIcon(new ImageIcon(Class.class.getResource("/resources/" + h)));
                } else if (i == 6) {
                    jButton8.setIcon(new ImageIcon(Class.class.getResource("/resources/" + h)));
                } else if (i == 7) {
                    jButton9.setIcon(new ImageIcon(Class.class.getResource("/resources/" + h)));
                } else if (i == 8) {
                    jButton10.setIcon(new ImageIcon(Class.class.getResource("/resources/" + h)));
                } else if (i == 9) {
                    jButton11.setIcon(new ImageIcon(Class.class.getResource("/resources/" + h)));
                }

            }
            try {
                System.out.println("before try");
                endthisfag();
            } catch (InterruptedException ex) {
                Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    });

    Thread meow = new Thread(new Runnable() {

        @Override
        public void run() {

            ENDTHISFAG();
            while (true) {
                System.out.println(p + " | " + q);
                System.out.println("check = " + check);

                int con = 0;

                for (int j = 0; j < checkimage.length; j++) {

                    if (checkimage[j] == 1) {
                        con++;
                    }
                }
                System.out.println("con = " + con);
                if (p == q && p != 0 && q != 0 && con == 2) {
                    count++;
                    power += 2;

                    for (int i = 0; i < image.length; i++) {
                        if (image[i] == (p - 1)) {
                            if (i == 0) {
                                jButton2.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                                jButton2.setEnabled(false);
                            } else if (i == 1) {
                                jButton3.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                                jButton3.setEnabled(false);
                            } else if (i == 2) {
                                jButton4.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                                jButton4.setEnabled(false);
                            } else if (i == 3) {
                                jButton5.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                                jButton5.setEnabled(false);
                            } else if (i == 4) {
                                jButton6.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                                jButton6.setEnabled(false);
                            } else if (i == 5) {
                                jButton7.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                                jButton7.setEnabled(false);
                            } else if (i == 6) {
                                jButton8.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                                jButton8.setEnabled(false);
                            } else if (i == 7) {
                                jButton9.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                                jButton9.setEnabled(false);
                            } else if (i == 8) {
                                jButton10.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                                jButton10.setEnabled(false);
                            } else if (i == 9) {
                                jButton11.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                                jButton11.setEnabled(false);
                            }
                        }
                    }

                    bounty++;
                    if(bounty == 3)
                    {
                        bountycheck = 1;
                    }
                    
                    int xy = secCount;
                    xy += 4;
                    if (xy <= 30) {
                        secCount += 4;
                        String copy1 = Integer.toString(secCount);

                        if (secCount <= 15) {
                            jLabel2.setForeground(Color.red);
                        } else {
                            jLabel2.setForeground(Color.DARK_GRAY);
                        }
                        jLabel2.setText(copy1);
                        c = 2;
                    } else {
                        secCount = 30;
                        String copy1 = Integer.toString(secCount);

                        if (secCount <= 15) {
                            jLabel2.setForeground(Color.red);
                        } else {
                            jLabel2.setForeground(Color.DARK_GRAY);
                        }
                        jLabel2.setText(copy1);
                        c = 2;
                    }

                    System.out.println(count);

                    p = 0;
                    q = 0;

                    for (int j = 0; j < checkimage.length; j++) {

                        checkimage[j] = 0;
                    }
                    con = 0;

                } else if (p == q && p != 0 && q != 0 && con == 1) {
                    System.out.println("321212121212");
                    jButton2.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton3.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton4.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton5.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton6.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton7.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton8.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton9.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton10.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton11.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    p = 0;
                    q = 0;
                    for (int j = 0; j < checkimage.length; j++) {

                        checkimage[j] = 0;
                    }
                    con = 0;
                } else if (p != q && p != 0 && q != 0) {
                    System.out.println("123");
                    jButton2.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton3.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton4.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton5.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton6.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton7.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton8.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton9.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton10.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    jButton11.setIcon(new ImageIcon(Class.class.getResource("/resources/b.jpg")));
                    p = 0;
                    q = 0;
                    bounty = 0;
                    for (int j = 0; j < checkimage.length; j++) {

                        checkimage[j] = 0;
                    }
                    con = 0;

                    int xy = secCount;
                    xy -= 1;
                    if (xy >= 0) {
                        secCount -= 1;
                        String copy1 = Integer.toString(secCount);

                        if (secCount <= 15) {
                            jLabel2.setForeground(Color.red);
                        } else {
                            jLabel2.setForeground(Color.DARK_GRAY);
                        }
                        jLabel2.setText(copy1);
                        c = 2;
                    } else if (xy <= 0) {
                        secCount = 0;
                        String copy1 = Integer.toString(secCount);

                        if (secCount <= 15) {
                            jLabel2.setForeground(Color.red);
                        } else {
                            jLabel2.setForeground(Color.DARK_GRAY);
                        }
                        jLabel2.setText(copy1);
                        c = 2;
                    }

                }

                if (count == 5) {
                    secCheck = 1;
                    try {
                        end();

                        //sec.stop();
                    } catch (Exception ex) {
                        Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                if (secCount == 0) {
                    UIManager.put("OptionPane.messageFont", new Font("Tahoma", Font.BOLD, 14));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    JOptionPane.showMessageDialog(null, "YOU LOST");
                    try {
                        finalend();
                    } catch (IOException ex) {
                        Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    meow.stop();
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }
    );

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setLocation(new java.awt.Point(450, 250));
        setPreferredSize(new java.awt.Dimension(1000, 630));
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/b.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/b.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/b.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/b.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/b.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/b.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/b.jpg"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/b.jpg"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/b.jpg"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/b.jpg"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 102, 102));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setText("Start");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("TIME : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("30");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(65, 65, 65)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(66, 66, 66)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(70, 70, 70)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(65, 65, 65)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(66, 66, 66)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(70, 70, 70)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 108, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String z;
        if (check == 1) {
            x = image[0] + 1;
            checkimage[0] = 1;

            z = x + ".jpg";
            jButton2.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check++;
            p = x;
            z = "";
        } else if (check == 2) {
            x = image[0] + 1;
            checkimage[0] = 1;

            z = x + ".jpg";
            jButton2.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check = 1;
            q = x;
            z = "";
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String z;
        if (check == 1) {
            x = image[1] + 1;
            checkimage[1] = 1;

            z = x + ".jpg";
            jButton3.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check++;
            p = x;
            z = "";
        } else if (check == 2) {
            x = image[1] + 1;
            checkimage[1] = 1;

            z = x + ".jpg";
            jButton3.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check = 1;
            q = x;
            z = "";
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String z;
        if (check == 1) {
            x = image[2] + 1;
            checkimage[2] = 1;

            z = x + ".jpg";
            jButton4.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check++;
            p = x;
            z = "";
        } else if (check == 2) {
            x = image[2] + 1;
            checkimage[2] = 1;

            z = x + ".jpg";
            jButton4.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check = 1;
            q = x;
            z = "";
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String z;
        if (check == 1) {
            x = image[3] + 1;
            checkimage[3] = 1;

            z = x + ".jpg";
            jButton5.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check++;
            p = x;
            z = "";
        } else if (check == 2) {
            x = image[3] + 1;
            checkimage[3] = 1;

            z = x + ".jpg";
            jButton5.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check = 1;
            q = x;
            z = "";
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String z;
        if (check == 1) {
            x = image[4] + 1;
            checkimage[4] = 1;

            z = x + ".jpg";
            jButton6.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check++;
            p = x;
            z = "";
        } else if (check == 2) {
            x = image[4] + 1;
            checkimage[4] = 1;

            z = x + ".jpg";
            jButton6.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check = 1;
            q = x;
            z = "";
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String z;
        if (check == 1) {
            x = image[5] + 1;
            checkimage[5] = 1;

            z = x + ".jpg";
            jButton7.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check++;
            p = x;
            z = "";
        } else if (check == 2) {
            x = image[5] + 1;
            checkimage[5] = 1;

            z = x + ".jpg";
            jButton7.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check = 1;
            q = x;
            z = "";
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String z;
        if (check == 1) {
            x = image[6] + 1;
            checkimage[6] = 1;

            z = x + ".jpg";
            jButton8.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check++;
            p = x;
            z = "";
        } else if (check == 2) {
            x = image[6] + 1;
            checkimage[6] = 1;

            z = x + ".jpg";
            jButton8.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check = 1;
            q = x;
            z = "";
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        String z;
        if (check == 1) {
            x = image[7] + 1;
            checkimage[7] = 1;

            z = x + ".jpg";
            jButton9.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check++;
            p = x;
            z = "";
        } else if (check == 2) {
            x = image[7] + 1;
            checkimage[7] = 1;

            z = x + ".jpg";
            jButton9.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check = 1;
            q = x;
            z = "";
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String z;
        if (check == 1) {
            x = image[8] + 1;
            checkimage[8] = 1;

            z = x + ".jpg";
            jButton10.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check++;
            p = x;
            z = "";
        } else if (check == 2) {
            x = image[8] + 1;
            checkimage[8] = 1;

            z = x + ".jpg";
            jButton10.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check = 1;
            q = x;
            z = "";
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        String z;
        if (check == 1) {
            x = image[9] + 1;
            checkimage[9] = 1;

            z = x + ".jpg";
            jButton11.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check++;
            p = x;
            z = "";
        } else if (check == 2) {
            x = image[9] + 1;
            checkimage[9] = 1;

            z = x + ".jpg";
            jButton11.setIcon(new ImageIcon(Class.class.getResource("/resources/" + z)));
            check = 1;
            q = x;
            z = "";
        }

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);

        jButton12.setEnabled(false);

        System.out.println("ggwp");
        //ggwp();
        //preStart();
        try {
            start();
        } catch (InterruptedException ex) {
            Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            fis = new FileInputStream("playerinfo.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            hold = (ArrayList<PlayerInfo>) ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            fis.close();
        } catch (IOException ex) {
            Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ois.close();
        } catch (IOException ex) {
            Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            fos = new FileOutputStream("playerinfo.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException ex) {
            Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int j = 0; j < hold.size(); j++) {
            if (hold.get(j).key == 1) {
                hold.get(j).key = 0;
            }
        }

        try {
            oos.writeObject(hold);
        } catch (IOException ex) {
            Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.flush();
        } catch (IOException ex) {
            Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(GAME.class.getName()).log(Level.SEVERE, null, ex);
        }

        MENU gg = new MENU();
        meow.stop();
        gg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
