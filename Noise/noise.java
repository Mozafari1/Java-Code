import java.io.*;

int cols, rows;
int scl = 20;
 int w = 3000;
  int h = 2000;
float [][] terrain;
float flying =0;
float xflying =0;

void setup(){
  size (800, 800, P3D);
  cols = w/scl;
  rows = h/scl;
terrain = new float[cols][rows];
  
}

void draw(){
  flying -=0.2;
  xflying -=0.1;
  float yoff = flying;
 for (int y = 0; y<rows; ++y){
   float xoff = xflying;
    for (int x = 0; x<cols; ++x){
      terrain[x][y] = map(noise(xoff,yoff),0,1,-150,150);
      xoff +=0.3;
    }
    yoff +=0.3;
 }
  background (67);
  stroke (4, 247, 98);
  noFill();
  translate(width/2, height/2);
  rotateX(PI/3);
  translate(-w/2,-h/2);
  for (int y = 0; y<rows-1; ++y){
    beginShape(TRIANGLE_STRIP);
    for (int x = 0; x<cols; ++x){
      
      //rect(x*scl, y*scl, scl, scl);
      vertex(x*scl, y*scl, terrain[x][y]);
      vertex(x*scl, (y+1)*scl,terrain[x][y+1]);

    }
    endShape();
  }
  
}