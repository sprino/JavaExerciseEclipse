/**
 * 
 */

var myStr = "Second String External. I am a \"double quoted\" string inside \"double quotes\" ";
var myStr2 = '<a href="http://www.google.com" target="_blank">Link</a>';
var myStr3 = "FirstLine\\\nSecondLine\\\rThirdLine";
var myArray = [["Saverio",35],["Peppe",50]];

document.write("<b>Bold Hello World via an external js file!</b> <br>");

document.write(myStr+"<br>");

document.write(myStr2+"<br>");

//alert(myStr3);

document.write("La lunghezza della stringa \"Ciao\" è :" + "ciao".length + "<br><br>");

document.write("Stampo il mio Array: " + myArray + "<br>");
myArray.push(["Anto",37]);
document.write("Ho fatto una push(), inserisco un elemento alla fine : "+ myArray + "<br>");
myArray.pop();
document.write("Ho fatto una pop(), tolgo l'ultimo elemento : "+ myArray + "<br>");
myArray.shift();
document.write("Ho fatto uno shift(), tolgo il primo elemento : "+ myArray + "<br>");
myArray.unshift(["Saverio",35]);
document.write("Ho fatto uno unshift(), aggiungo in prima posizione : "+ myArray + "<br><br>");

//Only change code below this line
function reusableFunction() {
  console.log("Hi World");
}
reusableFunction();

