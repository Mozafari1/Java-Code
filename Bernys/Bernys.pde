float xx = 0;
float yy= 0;
void setup(){
  
  size(800, 800);
  background(255);

}
void drawpoint(){
 stroke(244, 208, 24);
 strokeWeight(1);
 float px = map(xx,-2.1820, 2.6558,0,width);
 float py = map(yy,0, 9.9983,height,0);
 
 point(px,py); 
}
void nextpoint(){
   float nextX;
 float nextY;
 float r = random(1);
if(r<0.013){ 
 nextX = 0;
 nextY = 0.16;
}
else if(r<0.81){
 nextX = 0.80 *xx - 0.04 *yy;
 nextY = -0.04 *xx + 0.85 *yy + 1.4;
}else if(r<0.91){
 nextX = 0.200* xx -0.26* yy;
 nextY = 0.23 *xx + 0.22 *yy + 1.2;
}else{
 nextX = -0.14 *xx + 0.28 *yy;
 nextY = 0.26 *xx + 0.24 *yy + 0.44;
}
  xx = nextX;
  yy = nextY;
}
void draw(){
  for(int i =0; i <500; i++){
  drawpoint();
  nextpoint();
  }

}