// Juste remplir le tableau html avec la liste des pilotes
$(document).ready( function () {
	 var table = $('#tablePilotes').DataTable({
	 		"language": {
            				url: 'french/fr-FR.json'
        	},
			"sAjaxSource": "/api/pilotes",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    	{ "mData": "id"},
			    	{ "mData": "nom" },
			    	{ "mData": "site" }
			]
	 })
});
