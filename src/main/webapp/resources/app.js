/**
 * 
 */
var app = app || {};
app = {
		init : x=>{
			var head = dom.createElement( 'head' );
			var body = dom.createElement( 'body' );
			dom.documentElement.appendChild(head);
			dom.documentElement.appendChild(body);
			$('<div id="wrapper"></div>').appendTo('body');
			$('<div id="container"></div>').appendTo('wrapper');
			$('#container').load(home({id:'home'}));
			$('#result').text(x.result);
		},
		home : x=>{
			return '<div id="'+id+'"><h1 id="result"></h1></div>';
		}
		
};