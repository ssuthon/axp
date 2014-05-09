package test

class Book {
	String title
	String description
	
    static constraints = {
		title blank: false
    }
}
