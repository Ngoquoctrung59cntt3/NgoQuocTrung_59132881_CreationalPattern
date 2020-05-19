/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Trung_PC
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ShapeFactory factory= ShapeFactory.createInstance();
        
        Shape rectangle= factory.createShape(ShapeType.rectangle);
        rectangle.setBrush("Tủ lạnh Samsung Inverter 319 lít RT32K5930DX/SV");
        rectangle.setFrame("68cm chiều dài");
        rectangle.setPaper("172×60cm cao & rộng");
        
        Shape triangle= factory.createShape(ShapeType.triangle);
        triangle.setBrush("Tủ lạnh Panasonic Inverter 326 lít NR-BL351WKVN");
        triangle.setFrame("66 chiều dài");
        triangle.setPaper("165×65cm cao & rộng");
        
        Shape circle= factory.createShape(ShapeType.circle);
        circle.setBrush("Tủ lạnh LG Inverter 393 lít GN-D422BL");
        circle.setFrame("75cm chiều dài");
        circle.setPaper("168×70cm cao & rộng");
        
        System.out.println("Loại tủ 1:\n"+rectangle.draw()+"\n");
        System.out.println("Loại tủ 2:\n"+triangle.draw()+"\n");
        System.out.println("Loại tủ 3:\n"+circle.draw()+"\n");
    
    }
    
}
