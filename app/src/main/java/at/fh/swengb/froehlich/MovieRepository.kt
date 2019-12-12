package at.fh.swengb.froehlich

object MovieRepository {
    private val movies: List<Movie>

    init{
        val actorDeNiro = Person("Robert De Niro","17.08.1943") // Mean Streets, Taxi Driver, GoodFellas, The Irishman, Ronin
        val actorPesci = Person("Joe Pesci","09.02.1943") // GoodFellas, The Irishman
        val actorKeitel = Person("Harvey Keitel","13.05.1939") // Mean Streets, Reservoir Dogs
        val actorPacino = Person("Al Pacino","25.04.1940") // Der Pate 2, The Irishman, Der Pate
        val actorBrando = Person("Marlon Brando","03.04.1924") // Der Pate
        val actorTravolta = Person("John Travolta","18.02.1954") // Pulp Fiction
        val actorLJackson = Person("Samuel L. Jackson","21.12.1948") // Pulp Fiction
        val actorBuscemi = Person("Steve Buscemi", "13.12.1957") // Reservoir Dogs
        val actorMcDowell = Person("Malcolm McDowell", "13.06.1943") // A Clockwork Orange
        val actorGyllenhaal = Person("Jake Gyllenhaal", "19.12.1980") // Donnie Darko
        val actorHopkins = Person("Anthony Hopkins", "31.12.1937") // The Silence of the Lambs
        val actorFoster = Person("Jodie Foster", "19.11.1962") // The Silence of the Lambs
        val actorCruise = Person("Tom Cruise", "03.07.1962") // Eyes Wide Shut
        val actorKidman = Person("Nicole Kidman", "20.06.1967") // Eyes Wide Shut
        val actorNicholson = Person("Jack Nicholson", "22.04.1937") // Shining, One Flew Over the Cuckoo's Nest
        val actorPearce = Person("Guy Pearce", "05.10.1967") // Memento
        val actorReno = Person("Jean Reno", "30.07.1948") // Léon, Ronin
        val actorPortman = Person("Natalie Portman", "09.06.1981") // Léon
        val actorFiennes = Person("Ralph Fiennes", "22.12.1962") //The Grand Budapest Hotel
        val actorRossellini = Person("Isabella Rossellini", "18.06.1952") // Blue Velvet
        val actorMacLachlan = Person("Kyle MacLachlan", "22.02.1959") // Blue Velvet
        val dirScorsese = Person("Martin Scorsese", "17.11.1942")
        val dirCoppola = Person("Francis Ford Coppola", "07.04.1939")
        val dirTarantino = Person("Quentin Tarantino", "27.03.1963")
        val dirKubrick = Person("Stanley Kubrick", "26.07.1928")
        val dirKelly = Person("Richard Kelly", "28.03.1975")
        val dirDemme = Person("Jonathan Demme", "22.02.1944")
        val dirForman = Person("Miloš Forman", "18.02.1932")
        val dirNolan = Person("Christopher Nolan", "30.07.1970")
        val dirBesson = Person("Luc Besson", "18.03.1959")
        val dirAnderson = Person("Wes Anderson", "01.05.1969")
        val dirFrankenheimer = Person("John Frankenheimer", "19.02.1930")
        val dirLynch = Person("David Lynch", "20.01.1946")

        movies = listOf(
            Movie("1",
                "Mean Streets",
                "1973",
                dirScorsese,
                MovieGenre.DRAMA,
                listOf(actorDeNiro, actorKeitel),
                mutableListOf(),
                "A small-time hood aspires to work his way up the ranks of a local mob."
            ),
            Movie("2",
                "The Godfather: Part II",
                "1974",
                dirCoppola,
                MovieGenre.DRAMA,
                listOf(actorPacino),
                mutableListOf(),
                "The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate."
            ),
            Movie("3",
                "Taxi Driver",
                "1976",
                dirScorsese,
                MovieGenre.DRAMA,
                listOf(actorDeNiro),
                mutableListOf(),
                "A mentally unstable veteran works as a nighttime taxi driver in New York City, where the perceived decadence and sleaze fuels his urge for violent action by attempting to liberate a presidential campaign worker and an underage prostitute."
            ),
            Movie("4",
                "Goodfellas",
                "1990",
                dirScorsese,
                MovieGenre.BIOGRAPHY,
                listOf(actorDeNiro, actorPesci),
                mutableListOf(),
                "The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners Jimmy Conway and Tommy DeVito in the Italian-American crime syndicate."
            ),
            Movie("5",
                "The Irishman",
                "2019",
                dirScorsese,
                MovieGenre.BIOGRAPHY,
                listOf(actorDeNiro, actorPesci, actorPacino),
                mutableListOf(),
                "A mob hitman recalls his possible involvement with the slaying of Jimmy Hoffa."
            ),
            Movie("6",
                "The Godfather",
                "1972",
                dirCoppola,
                MovieGenre.DRAMA,
                listOf(actorPacino, actorBrando),
                mutableListOf(),
                "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."
            ),
            Movie("7",
                "Pulp Fiction",
                "1994",
                dirTarantino,
                MovieGenre.DRAMA,
                listOf(actorTravolta, actorLJackson),
                mutableListOf(),
                "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption."
            ),
            Movie("8",
                "A Clockwork Orange",
                "1971",
                dirKubrick,
                MovieGenre.DRAMA,
                listOf(actorMcDowell),
                mutableListOf(),
                "In the future, a sadistic gang leader is imprisoned and volunteers for a conduct-aversion experiment, but it doesn't go as planned."
            ),
            Movie("9",
                "Reservoir Dogs",
                "1992",
                dirTarantino,
                MovieGenre.DRAMA,
                listOf(actorBuscemi, actorKeitel),
                mutableListOf(),
                "When a simple jewelry heist goes horribly wrong, the surviving criminals begin to suspect that one of them is a police informant."
            ),
            Movie("10",
                "Donnie Darko",
                "2001",
                dirKelly,
                MovieGenre.SCIFI,
                listOf(actorGyllenhaal),
                mutableListOf(),
                "A troubled teenager is plagued by visions of a man in a large rabbit suit who manipulates him to commit a series of crimes, after he narrowly escapes a bizarre accident."
            ),
            Movie("11",
                "The Silence of the Lambs",
                "1991",
                dirDemme,
                MovieGenre.THRILLER,
                listOf(actorHopkins, actorFoster),
                mutableListOf(),
                "A young F.B.I. cadet must receive the help of an incarcerated and manipulative cannibal killer to help catch another serial killer, a madman who skins his victims."
            ),
            Movie("12",
                "Eyes Wide Shut",
                "1999",
                dirScorsese,
                MovieGenre.DRAMA,
                listOf(actorCruise, actorKidman),
                mutableListOf(),
                "A New York City doctor embarks on a harrowing, night-long odyssey of sexual and moral discovery after his wife reveals a painful secret to him."
            ),
            Movie("13",
                "The Shining",
                "1980",
                dirKubrick,
                MovieGenre.HORROR,
                listOf(actorNicholson),
                mutableListOf(),
                "A family heads to an isolated hotel for the winter where a sinister presence influences the father into violence, while his psychic son sees horrific forebodings from both past and future."
            ),
            Movie("14",
                "One Flew Over the Cuckoo's Nest",
                "1975",
                dirForman,
                MovieGenre.DRAMA,
                listOf(actorNicholson),
                mutableListOf(),
                "A criminal pleads insanity and is admitted to a mental institution, where he rebels against the oppressive nurse and rallies up the scared patients."
            ),
            Movie("15",
                "Memento",
                "2000",
                dirNolan,
                MovieGenre.PSYTHRILLER,
                listOf(actorPearce),
                mutableListOf(),
                "A man with short-term memory loss attempts to track down his wife's murderer."
            ),
            Movie("16",
                "Léon",
                "1994",
                dirBesson,
                MovieGenre.ACTION,
                listOf(actorReno, actorPortman),
                mutableListOf(),
                "Mathilda, a 12-year-old girl, is reluctantly taken in by Léon, a professional assassin, after her family is murdered. An unusual relationship forms as she becomes his protégée and learns the assassin's trade."
            ),
            Movie("17",
                "The Grand Budapest Hotel",
                "2014",
                dirAnderson,
                MovieGenre.COMEDY,
                listOf(actorFiennes),
                mutableListOf(),
                "The adventures of Gustave H, a legendary concierge at a famous hotel from the fictional Republic of Zubrowka between the first and second World Wars, and Zero Moustafa, the lobby boy who becomes his most trusted friend."
            ),
            Movie("18",
                "Ronin",
                "1998",
                dirFrankenheimer,
                MovieGenre.ACTION,
                listOf(actorDeNiro, actorReno),
                mutableListOf(),
                "A freelancing former U.S. Intelligence Agent tries to track down a mysterious package that is wanted by the Irish and the Russians."
            ),
            Movie("19",
                "Blue Velvet",
                "1986",
                dirLynch,
                MovieGenre.PSYTHRILLER,
                listOf(actorRossellini, actorMacLachlan),
                mutableListOf(),
                "The discovery of a severed human ear found in a field leads a young man on an investigation related to a beautiful, mysterious nightclub singer and a group of psychopathic criminals who have kidnapped her child."
            )
        )
    }


    fun movieList(): List<Movie> {
        return movies
    }

    fun movieById(id: String?): Movie? {
        return movies.find { it.id == id }
    }

    fun reviewMovie(id: String?, review: Review) {
        movieById(id)?.reviews?.add(review)
    }
}