/*** When you are done, this program will draw an ellipse 
     that travels across the screen when the mouse is pressed.
***/

  /***********  SOUND ***************
   * Some computers are unable to play sounds. 
   * If you cannot play sound on this computer, set canPlaySounds to false.
   * If you are not sure, ask your teacher 
   * *****************/
  boolean canPlaySounds = true;

int x =50;
int y =50;
void setup() {
    size(2000, 2000);
    
    //1. Set the variable named x to 50.
}

void draw() {

	background(200,200,200);
 fill (#08404D);
    //2. Draw an ellipse of height and width 50. Make sure to use the x variable for its X position. 
    //   Pick a y value that places it half way down the window.
      ellipse (200,400,x,x);ellipse (200,400,x,y);ellipse (400,350,x,x);ellipse (400,70,x,x);ellipse (400,12,x,x);ellipse (400,600,x,x);ellipse (400,3,x,x);ellipse (400,500,x,x);ellipse (400,300,x,x);ellipse (400,100,x,x);
      ellipse (200,400,x,x);
      ellipse (400,400,x,x);
      ellipse (400,400,x,x);
      ellipse (1,400,x,x);ellipse (10,400,x,y);ellipse (20,350,x,x);ellipse (30,70,x,y);ellipse (50,12,x,x);ellipse (60,600,x,y);ellipse (70,3,x,y);ellipse (80,500,x,x);ellipse (886,300,x,y);ellipse (550,100,x,x);
      
      ellipse (100,400,x,y);ellipse (200,400,x,x);ellipse (300,350,x,y);ellipse (400,70,x,x);ellipse (500,12,x,y);ellipse (600,600,x,y);ellipse (40,3,x,y);ellipse (367,500,x,x);ellipse (244,300,x,x);ellipse (345,100,x,y);
    //3. Make the ellipse a nice color
ellipse (400,400,x,x);
    //4. If the mouse is pressed change the x value so that the dot moves to the right
if (mousePressed) {
  x +=111;
  y+=30; 
    //5. If your dot moves slowly, make it move faster. If it moves too quickly, slow it down
    //  (you have to figure out what part of your code to change)

    //6. Use an if statement to play a sound (ding) when your dot crosses the finish line (right side of window).
    //   A playSound() method is provided (you have to uncomment the code at the bottom of this program to get this to work)
    
}}

/*
import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
  
  if (canPlaySounds) {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding.wav");
        sound.trigger();
        soundPlayed = true;
    }
  }
  fill(0);
  textSize(36);
  text("WINNER!!", width/2, height/2);
}
*/
