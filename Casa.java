
public class Casa
{
   //variables de instancia//
    Circle ventana = new Circle();
    Triangle techo = new Triangle();
    Square puerta = new Square();
    Square pared = new Square();
    
   //Constructor
    Casa()
    {
        ventana = new Circle();
        techo = new Triangle();
        puerta = new Square();
        pared = new Square();
    }
    
    void dibujate()
    {
     ventana.makeVisible();
     techo.makeVisible();
     puerta.makeVisible();
     pared.makeVisible();
    }
    
    void ordenate()
    {
        
        pared.changeColor("green");
        pared.moveRight();
        pared.moveRight();
        pared.moveRight();
        pared.changeSize(60);
        puerta.changeColor("blue");
        puerta.moveRight();
        puerta.moveDown();
        puerta.moveDown();
        puerta.moveRight();
        puerta.moveRight();
        puerta.moveRight();
        puerta.changeSize(19);
        techo.changeColor("black");
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        techo.changeSize(40,95);
        ventana.changeColor("red");
        ventana.changeSize(10);
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveUp();
        ventana.moveUp();
        ventana.moveRight();
        ventana.moveDown();
    }
    
    void ordenate2()
    {
        pared.changeColor("green");
        pared.moveRight();
        pared.moveRight();
        pared.moveRight();
        pared.moveRight();
        pared.moveRight();
        pared.moveRight();
        pared.moveRight();
        pared.moveRight();
        pared.moveRight();
        pared.changeSize(60);
        puerta.changeColor("blue");
        puerta.moveRight();
        puerta.moveRight();
        puerta.moveDown();
        puerta.moveDown();
        puerta.moveRight();
        puerta.moveRight();
        puerta.moveRight();
        puerta.moveRight();
        puerta.moveRight();
        puerta.moveRight();
        puerta.moveRight();
        puerta.changeSize(19);
        techo.changeColor("black");
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        techo.changeSize(40,95);
        ventana.changeColor("red");
        ventana.changeSize(10);
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveUp();
        ventana.moveUp();
        ventana.moveRight();
        ventana.moveDown();
    }
    
}
