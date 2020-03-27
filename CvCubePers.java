import java.awt.*;
import java.awt.event.*;

class CvCubePers extends Canvas

 { int centerX, centerY;
 Obj obj = new Obj();

int iX(float x){return Math.round(centerX + x);}
int iY(float y){return Math.round(centerY - y);}

void line(Graphics g, int i, int j)
 { Point2D p = obj.vScr[i], q = obj.vScr[j];
 g.drawLine(iX(p.x), iY(p.y), iX(q.x), iY(q.y));
}

public void paint(Graphics g) // Função que mostra a transformação em perspectiva
 { Dimension dim = getSize();
 int maxX = dim.width - 1, maxY = dim.height - 1,
  minMaxXY = Math.min(maxX, maxY);
centerX = maxX/2; centerY = maxY/2;
 obj.d = obj.rho * minMaxXY / obj.objSize; obj.eyeAndScreen();
}
line(g, 0, 1);
line(g, 1, 2);
line(g, 2, 3);
line(g, 3, 0); 
line(g, 4, 5);
line(g, 5, 6);
line(g, 6, 7); 
line(g, 7, 4);
line(g, 0, 4);
line(g, 1, 5);
line(g, 2, 6);
line(g, 3, 7);
}
