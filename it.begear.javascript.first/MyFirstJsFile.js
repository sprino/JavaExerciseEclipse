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

//Confronto restrittivo, fa distinzione tra carattere e numero cosa che non farebbe == .
//Setup
function testStrict(val) {
  if (val === 3) { // Change this line
    document.write("Equal");
  }
  else{
	document.write("Not Equal");	  
  }
}
// Change this value to test
testStrict('3');

//Oggetto in JavaScript
var testObj = {
		"nome" : "Rino",
		"numero" : 34,
}
//accesso agli oggetti
document.write("<br>" + testObj.nome);
//Bracket Notation
document.write("<br>" + testObj["nome"]);
//aggiungo proprietà ad un oggetto
testObj["occhi"] = "verdi";
document.write("<br>" + testObj.occhi);
//Elimino proprietà
delete testObj.occhi;
document.write("<br>" + testObj.occhi);

//JSON. Java Script Object Notation
var myMusic = [
	  {
	    "artist": "Billy Joel",
	    "title": "Piano Man",
	    "release_year": 1973,
	    "formats": [ 
	      "CS", 
	      "8T", 
	      "LP" ],
	    "gold": true
	  },
	  // Add record here
	  {
	  "artist": "Daft Punk",
	  "title": "Homework",
	  "release_year": 1997,
	  "formats": [ 
	    "CD",
	    "Cassette",
	    "LP"
	  ],
	  "gold": true
	}
];
document.write("<br>" + myMusic[0].artist);