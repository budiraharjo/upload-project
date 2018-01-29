/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author VEI
 */
public class PanelGambar extends JPanel {
private Image gambar;

    public PanelGambar() {

        setOpaque(false);

        gambar = new ImageIcon(getClass().getResource

        ("/aplikasi/transparan/images (20).jpg")).getImage();

    }

    @Override

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

       

        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setComposite(AlphaComposite.SrcOver.derive(0.5F));

        g2d.drawImage(gambar, 0, 0,null);

        g2d.dispose();

    }

}