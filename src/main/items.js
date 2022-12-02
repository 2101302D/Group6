var keyboardArray = [{
	"name" : "Wooting Two HE",
	"image" : "https://uploads-ssl.webflow.com/612ca8920bc3a648125ffac3/623207cf3b77e02a8e6a1564_Wooting-two-HE-min.png"
}];

function displayKeyboard(){
	var table = document.getElementById("keyboardTable");
	var keyboardCount = 0;
	document.getElementById("summary").textContent = "";
	document.getElementById("parent").textContent = "";
	
	table.innerHTML = "";
	totalKeyboard = keyboardArray.length;
	for(var count = 0; count < totalKeyboard; count++ ){
		var name = keyboardArray[count].name;
		var image = keyboardArray[count].image;
		var cell =    '<div class="card col-lg-4 text-center " style="background-color:#dbdbdb;">\
      <img class="card-img-top" width: 100%; width = "200px" height = "200px" src="' +
      image +
      '" alt="Card image cap">\
      <div class = "card-body">\
     <h5 style="cursor:pointer" class="card-title" item="' +
      count +
      '" onClick="showRestaurantDetails(this)">' +
      name +
      '</h5></div>\
      </div>";
      table.insertAdjacentHTML("beforeend", cell);
      keyboardCount++;
	}
}