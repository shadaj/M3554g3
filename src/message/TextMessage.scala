package message

object TextMessage extends App {
	def translate(writing: String): String = {
	  val translatorUpper = Map('T' -> '7', 'I' -> '1', 'E' -> '3', 'S' -> '5', 'A' -> '4', 'O' -> '0')
	  val translatorLower = translatorUpper.map{case (k,v) => (k.toLower -> v)}
	  val translatorAll = (translatorUpper ++ translatorLower).withDefault(k => k)
	  writing.map(translatorAll)
	}
	
	println(translate(readLine("Text? ")))
	
	println(translate("""
		THIS MESSAGE
	    SERVES TO PROVE
	    HOW OUR MINDS CAN
	    DO AMAZING THINGS!
	    IMPRESSIVE THINGS!
	    IN THE BEGINNING
	    IT WAS HARD BUT
	    NOW, ON THIS LINE
	    YOUR MIND IS
	    READING IT
	    AUTOMATICALLY
	    WITH OUT EVEN
	    THINKING ABOUT IT,
	    BE PROUD! ONLY
	    CERTAIN PEOPLE CAN
	    READ THIS
	"""))
}