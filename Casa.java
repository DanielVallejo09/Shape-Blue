
public class Casa
{
   //variables de instancia//
    Circle ventana = new Circle();
    Triangle techo = new Triangle();
    Square puerta = new Square();
    Square pared = new Square();
    
   //Constructor
    /**
     * Esto nos permite construir un nuevo objeto solicitado
     */
    Casa()
    {
        ventana = new Circle();
        techo = new Triangle();
        puerta = new Square();
        pared = new Square();
    }
    
    /**
     * Este metodo Nos permite dibujar las figuras geometricas
     */
    void dibujate()
    {
     ventana.makeVisible();
     techo.makeVisible();
     puerta.makeVisible();
     pared.makeVisible();
    }
    
    /**
     * Este metodo nos dibuja la casa con las figuras geometricas
     */
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
    
    /**
     *Dibuja casa que sigue 
     */
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
        ventana.moveUp();
        ventana.moveUp();
        ventana.moveRight();
        ventana.moveDown();
    }
    
}
