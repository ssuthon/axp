package test

class Book {
	String title
	String description
	
	static mapping = {
		description type: 'text'
	}
    static constraints = {
		title blank: false
    }
}
