
/**
 * Personen
 */

/**
 * Die Tabellen werden geladen
 */
$(document).ready(function() {
	loadDataTable();
	loadFriendTable();
	loadVerwandTable();
	loadBekanntTable();
	
/**
 * Die Form new Person wird verarbeitet
 */
$("#newPersonen").submit(function(event) { 
	postPersonen(event);				
});
	
/**
 * Tabelle wird geladen
 */
$('#loadtable').click(function() {
	loadDataTable();
	});
});

function loadFriendTable() {
	var table = $('#friendtable').DataTable({ 
		destroy : true,
		"ajax" : {
/**
 * URL
 */
			"url" : "/personenbyfreundePersonen",
/**
 * Cause of flat JsonObjects
 */
			"dataSrc" : "" 
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
	var table = $('#verwandtable').DataTable({
		destroy : true,
		"ajax" : {
/**
 * URL
 */
			"url" : "/personenbyverwandPersonen",
/**
 * Cause of flat JsonObjects
 */
			"dataSrc" : ""
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
	var table = $('#bekannttable').DataTable({ 
		destroy : true,
		"ajax" : {
/**
 * URL
 */
			"url" : "/personenbybekanntePersonen",
/**
 * Cause of flat JsonObjects
 */
			"dataSrc" : ""
		},
		"columns" : [ {
			"data" : "id"
		}, {
			"data" : "bekanntePersonen.0.id"
		
		}, 
		
		
		]
	});
}
function postPersonen(event)
/**
 * get the form data
 */
/**
 * Das val() steht für den Wert der für die jeweiligen 
 * Variablen eingegeben wird
 */
	var formData = {
		'id' : $('input[name=id]').val(),
		'anrede' : $('input[name=anrede]').val(),
		'vorname' : $('input[name=vorname]').val(),
		'nachname' : $('input[name=nachname]').val(),
		'adresse' : $('input[name=adresse]').val(),
		'email' : $('input[name=email').val(),
		'fon' : $('input[name=fon]').val(),
		'mobil' : $('input[name=mobil]').val()
		
	};
	// 
	$.ajax({
		type : 'POST',
		contentType : 'application/json',
/**
 * URL, wo man posten möchte
 */
		url : '/personen', 
/**
 * Daten, die wir posten möchten
 */
		data : JSON.stringify(formData),
		success : function(data, textStatus, jQxhr) {
/**
 * damit die Tabelle sofort neu lädt, wenn etwas gesendet wird
 * dann muss man nicht jedes mal die Seite neu laden
 */
			loadDataTable(); 
		},
/**
 * sorgt dafür, dass Fehlermeldungen angezeigt werden,
 * ist praktisch fürs Debugging
 */
		error : function(jqXhr, textStatus, errorThrown) { 
			console.log(errorThrown);
		}
	});
	
	event.preventDefault(); 
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
	var table = $('#personentable').DataTable({ 
		destroy : true,
		"ajax" : {
			"url" : "/personen", 
			"dataSrc" : "" 
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


