/* Paste the code into a new Processing sketch and complete the steps. */

//1. create an array of ints. don't initialize it yet.
int[] nList;

void setup() {
  //2. set the size of your window
  size(650,900);
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.

  //3. initialize your array with the built in width variable
  nList = new int[width];
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  for (int i=0; i < nList.length; i++){
   nList[i] = (int) random(0, height);
  }
  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
    background(300,100,200);
  //7. set the color for your graph
       color(50,255,100);
  //8. draw a rectangle for each int in your array.
       for(int i=0; i<nList.length; i++){
        rect(i,nList[i], 1, -i); 
  //   the x value will be the element of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array
       }

  //9. call the stepSort method
    
  //10. extract the code that randomizes the array into a method.

  //11. call the method you made in step 10 when the mouse is pressed

}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}