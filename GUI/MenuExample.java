package GUI;
import java.awt.*;  
class MenuExample  
{  
    MenuExample(){
        Frame f= new Frame("Menu and MenuItem Example");  
         MenuBar mb=new MenuBar();  
         Menu menu=new Menu("Menu");
         Menu submenu=new Menu("Sub Menu");  
         MenuItem i1=new MenuItem("File");  
         MenuItem i2=new MenuItem("Save as");  
         MenuItem i3=new MenuItem("Copy");  
         MenuItem i4=new MenuItem("Paste");  
         MenuItem i5=new MenuItem("Cut");  
	 MenuItem i6=new MenuItem("Save to Google Drive"); 
         menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);  
	 menu.add(i6);  
         submenu.add(i4);  
         submenu.add(i5);
         menu.add(submenu);  
         mb.add(menu);  
         f.setMenuBar(mb);  
         f.setSize(400,400); 
         f.setLayout(null);  
         f.setVisible(true);  
    }  
    public static void main(String args[]){  
        new MenuExample();  
    }  
}  