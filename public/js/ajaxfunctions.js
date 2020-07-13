//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//Personen

//On Page load - register listeners and load existing videos in datatable
$(document).ready(function() {
	//
	loadDataTable();
	loadFriendTable();
	loadVerwandTable();
	loadBekanntTable();
	// process the form newPerson
	$("#newPersonen").submit(function(event) { //geändert
		postPersonen(event);					//geändert
	});
	
	// Load Datatable
	$('#loadtable').click(function() {
	loadDataTable();
	});
	
	
	
});


function loadFriendTable() {
	var table = $('#friendtable').DataTable({ //ÄNDERUNG
		destroy : true,
		//"processing" : true,
		"ajax" : {
			"url" : "/personenbyfreundePersonen", // URL
			"dataSrc" : "" // Cause of flat JsonObjects
		},
		"columns" : [ {
			"data" : "id"
		}, {
			"data" : "freundePersonen.0.id"
		
		}, 
		
		
		]
	});
}
function loadVerwandTable() {
	var table = $('#verwandtable').DataTable({ //ÄNDERUNG
		destroy : true,
		//"processing" : true,
		"ajax" : {
			"url" : "/personenbyverwandPersonen", // URL
			"dataSrc" : "" // Cause of flat JsonObjects
		},
		"columns" : [ {
			"data" : "id"
		}, {
			"data" : "verwandPersonen.0.id"
		
		}, 
		
		
		]
	});
}
function loadBekanntTable() {
	var table = $('#bekannttable').DataTable({ //ÄNDERUNG
		destroy : true,
		//"processing" : true,
		"ajax" : {
			"url" : "/personenbybekanntePersonen", // URL
			"dataSrc" : "" // Cause of flat JsonObjects
		},
		"columns" : [ {
			"data" : "id"
		}, {
			"data" : "bekanntePersonen.0.id"
		
		}, 
		
		
		]
	});
}
function postPersonen(event) { //Änderung
	// get the form data
	var formData = {
		'id' : $('input[name=id]').val(), // das val() steht für den wert
												// der zb bei title eingegeben
												// wird, zb. rapunzel
		'anrede' : $('input[name=anrede]').val(),
		'vorname' : $('input[name=vorname]').val(),
		'nachname' : $('input[name=nachname]').val(),
		'adresse' : $('input[name=adresse]').val(),
		'email' : $('input[name=email').val(),
		'fon' : $('input[name=fon]').val(),
		'mobil' : $('input[name=mobil]').val()
		
	};
	// process the form
	$.ajax({
		type : 'POST', // define the type of HTTP verb we want to
		// use (POST for our form)
		contentType : 'application/json',
		url : '/personen', // url where we want to POST ÄNDERUNG
		data : JSON.stringify(formData), // data we want to POST
		success : function(data, textStatus, jQxhr) {
			loadDataTable(); // damit die tabelle sofort neu lädt, wenn etwas
								// gesendet wird (dann muss man nicht jedes mal
								// die seite neu laden)
		},
		error : function(jqXhr, textStatus, errorThrown) { // praktisch fürs
															// debugging, ohne
															// das wird keine
															// fehlermeldung
															// angezeigt
			console.log(errorThrown);
		}
	});
	// stop the form from submitting the normal way and refreshing the
	// page
	event.preventDefault(); // kp ist irgendwie dafür da, dass die seite nicht
							// neu geladen wird sondern man ein
							// andwendungsfeeling hat
}


$(document).ready(function() {
	$('#deletePersonen').submit(function(event) {
		deletePersonen();
	});
});

$(function() {
	$(".delete").click(function() {
		deletePersonen();
	});
});


/** Wird die Methode aufgerufen wird zuerst die eingegebene ID einer Variable zugeordnet, anhand dieser
 * wird die spezifische URL aufgerufen und der Kontakt gelöscht.
 * War dies erfolgreich wird eine Erfolgsnachricht eingeblendet
 * Wird versucht ein Kontakt zu löschen der nicht existiert, kommt eine Fehlermeldung
 */
function deletePersonen() {
	var id1 = document.getElementById("id1").value;
	$.ajax({
		type : "DELETE",
		url : "personen/" + id1,
		async : false,
		success : function(result) {
			window.location.href = "kontaktLöschen.html";
			alert("Person wurde gelöscht!");
		},
		error : function(result) {
			alert("Kontakt konnte nicht gelöscht werden!");
			console.log(errorThrown)
		}
	});
	event.preventDefault();
}
$(document).ready(function() {
	$('#addBeziehung option [value = befreundet]').submit(function(event) {
		addBeziehung();
	});
});


$(function() {
	$(".addBeziehung").click(function() {
		deletePersonen();
	});
});

function addBeziehung() {
	var id1 = document.getElementById("id1").value;
	var id2 = document.getElementById("id2").value;
	$.ajax({
		type : "POST",
		url : "personen/" + id1,
		async : false,
		success : function(result) {
			window.location.href = "kontaktLöschen.html";
			alert("Person wurde gelöscht!");
		},
		error : function(result) {
			alert("Kontakt konnte nicht gelöscht werden!");
			console.log(errorThrown)
		}
	});
	event.preventDefault();
}
function loadDataTable() {
	var table = $('#personentable').DataTable({ //ÄNDERUNG
		destroy : true,
		"ajax" : {
			"url" : "/personen", // URL
			"dataSrc" : "" // Cause of flat JsonObjects
		},
		"columns" : [ {
			"data" : "id"
		}, {
			"data" : "anrede"
		}, {
			"data" : "vorname"
		}, {
			"data" : "nachname"
		}, {
			"data" : "adresse"
		}, {
			"data" : "email"
		}, {
			"data" : "fon"
		}, {
			"data" : "mobil"
		}
		
		]
	});
}


