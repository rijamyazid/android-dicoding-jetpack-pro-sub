package com.example.jetpack_submissions.utils

import com.example.jetpack_submissions.R
import com.example.jetpack_submissions.data.MovieEntity
import com.example.jetpack_submissions.data.source.remote.response.MovieItem
import com.example.jetpack_submissions.data.source.remote.response.TVShowItem

object DataDummy {

    fun generateRemoteDummyMovies(): ArrayList<MovieItem> {

        val listMovie = ArrayList<MovieItem>()

        listMovie.add(
            MovieItem(
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "en",
                "Mortal Kombat",
                false,
                "Mortal Kombat",
                listOf(14, 28, 12, 878, 53),
                "/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                "2021-04-07",
                4614.697,
                7.8,
                460465,
                false,
                2079
            )
        )

        listMovie.add(
            MovieItem(
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                "en",
                "Godzilla vs. Kong",
                false,
                "Godzilla vs. Kong",
                listOf(878, 28, 18),
                "/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",
                "/inJjDhCjfhh3RtrJWBmmDqeuSYC.jpg",
                "2021-03-24",
                2543.473,
                8.2,
                399566,
                false,
                5255
            )
        )

        listMovie.add(
            MovieItem(
                "Victoria is a young mother trying to put her dark past as a Russian drug courier behind her, but retired cop Damon forces Victoria to do his bidding by holding her daughter hostage. Now, Victoria must use guns, guts and a motorcycle to take out a series of violent gangsters—or she may never see her child again.",
                "en",
                "Vanquish",
                false,
                "Vanquish",
                listOf(28, 80, 53),
                "/AoWY1gkcNzabh229Icboa1Ff0BM.jpg",
                "/mYM8x2Atv4MaLulaV0KVJWI1Djv.jpg",
                "2021-04-16",
                2535.022,
                6.0,
                804435,
                false,
                51
            )
        )

        return listMovie

    }

    fun generateRemoteDummyTVShows(): ArrayList<TVShowItem> {

        val listMovie = ArrayList<TVShowItem>()

        listMovie.add(
            TVShowItem(
                "2021-03-19",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "en",
                listOf(10765, 10759, 18, 10768),
                "/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                listOf("US"),
                "/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                "The Falcon and the Winter Soldier",
                2008.626,
                7.9,
                "The Falcon and the Winter Soldier",
                88396,
                5264,
            )
        )

        listMovie.add(
            TVShowItem(
                "2021-03-26",
                "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage.",
                "en",
                listOf(16, 10759, 18, 10765),
                "/yDWJYRAwMNKbIYT8ZB33qy84uzO.jpg",
                listOf("US"),
                "/6UH52Fmau8RPsMAbQbjwN3wJSCj.jpg",
                "Invincible",
                1967.083,
                8.9,
                "Invincible",
                95557,
                1237,
            )
        )

        listMovie.add(
            TVShowItem(
                "2017-09-25",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives.",
                "en",
                listOf(18),
                "/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                listOf("US"),
                "/mZjZgY6ObiKtVuKVDrnS9VnuNlE.jpg",
                "The Good Doctor",
                1303.627,
                8.6,
                "The Good Doctor",
                71712,
                8256,
            )
        )

        return listMovie

    }

    fun generateDummyMovies(): ArrayList<MovieEntity> {

        val listMovie = ArrayList<MovieEntity>()

        listMovie.add(
            MovieEntity(
                "m1",
                "Alita: Battle Angel",
                "Robert Rodriguez",
            "United States",
            "2019",
            "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                    listOf("Action", "Science Fiction", "Adventure"),
            R.drawable.poster_alita
        ))
        listMovie.add(
            MovieEntity(
            "m2",
            "Aquaman",
            "James Wan",
            "United States",
            "2018",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                    listOf("Action", "Adventure", "Fantasy"),
                    R.drawable.poster_aquaman
        ))
        listMovie.add(
            MovieEntity(
            "m3",
            "Cold Pursuit",
            "Hans Petter Moland",
            "United States",
            "2019",
            "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                    listOf("Action", "Crime", "Thriller"),
                    R.drawable.poster_cold_persuit
        ))
        listMovie.add(
            MovieEntity(
            "m4",
            "Creed II",
            "Steven Caple Jr.",
            "United States",
            "2018",
            "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                    listOf("Drama"),
                    R.drawable.poster_creed
        ))
        listMovie.add(
            MovieEntity(
            "m5",
            "Fantastic Beasts: The Crimes of Grindelwald",
            "David Yates",
            "United States",
            "2018",
            "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                    listOf("Adventure", "Fantasy", "Drama"),
                    R.drawable.poster_crimes
        ))
        listMovie.add(
            MovieEntity(
            "m6",
            "Glass",
            "M. Night Shyamalan",
            "United States",
            "2019",
            "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                    listOf("Thriller", "Drama", "Science Fiction"),
                    R.drawable.poster_glass
        ))
        listMovie.add(
            MovieEntity(
            "m7",
            "How to Train Your Dragon: The Hidden World",
            "Dean DeBlois",
            "United States",
            "2019",
            "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                    listOf("Animation", "Family", "Adventure"),
                    R.drawable.poster_how_to_train
        ))
        listMovie.add(
            MovieEntity(
            "m8",
            "Avengers: Infinity War",
            "Anthony Russo",
            "United States",
            "2018",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                    listOf("Adventure", "Action", "Science Fiction"),
                    R.drawable.poster_infinity_war
        ))
        listMovie.add(
            MovieEntity(
            "m9",
            "Mortal Engines",
            "Christian Rivers",
            "United States",
            "2018",
            "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                    listOf("Adventure", "Science Fiction"),
                    R.drawable.poster_mortal_engines
        ))
        listMovie.add(
            MovieEntity(
            "m10",
            "Spider-Man: Into the Spider-Verse",
            "Rodney Rothman",
            "United States",
            "2018",
            "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                    listOf("Action", "Adventure", "Animation", "Science Fiction", "Comedy"),
                    R.drawable.poster_spiderman
        ))

        return listMovie
    }

    fun generateDummyTvshows(): ArrayList<MovieEntity> {

        val listTvshow = ArrayList<MovieEntity>()

        listTvshow.add(
            MovieEntity(
            "t1",
            "Dragon Ball",
            "Akira Toriyama",
            "Japan",
            "1986",
            "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish",
                    listOf("Animation", "Action", "Adventure", "Sci-Fi", "Fantasy"),
                    R.drawable.tv_poster_dragon_ball
        ))
        listTvshow.add(MovieEntity(
            "t2",
            "Fairy Tail",
            "Hiro Mashima",
            "Japan",
            "2009",
            "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                listOf("Action", "Adventure", "Animation", "Comedy", "Sci-Fi", "Fantasy", "Mystery"),
                R.drawable.tv_poster_fairytail
        ))
        listTvshow.add(MovieEntity(
            "t3",
            "Family Guy",
            "Seth MacFarlane",
            "United States",
            "1999",
            "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                listOf("Animation", "Comedy"),
                R.drawable.tv_poster_family_guy
        ))
        listTvshow.add(MovieEntity(
            "t4",
            "The Flash",
            "Greg Berlanti",
            "United States",
            "2014",
            "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                listOf("Drama", "Sci-Fi","Fantasy"),
                R.drawable.tv_poster_flash
        ))
        listTvshow.add(MovieEntity(
            "t5",
            "Hanna",
            "David Farr",
            "United States",
            "2019",
            "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                listOf("Action", "Adventure", "Drama"),
                R.drawable.tv_poster_hanna
        ))
        listTvshow.add(MovieEntity(
            "t6",
            "Naruto Shipudden",
            "Masashi Kishimoto",
            "Japan",
            "2007",
            "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                listOf("Animation", "Action", "Adventure", "Sci-Fi", "Fantasy"),
                R.drawable.tv_poster_naruto_shipudden
        ))
        listTvshow.add(MovieEntity(
            "t7",
            "NCIS",
            "Donald P. Bellisario",
            "United States",
            "2003",
            "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                listOf("Crime", "Action", "Adventure", "Drama"),
                R.drawable.tv_poster_ncis
        ))
        listTvshow.add(MovieEntity(
            "t8",
            "Riverdale",
            "Roberto Aguirre-Sacasa",
            "United States",
            "2017",
            "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                listOf("Mystery", "Drama", "Crime"),
                R.drawable.tv_poster_riverdale
        ))
        listTvshow.add(MovieEntity(
            "t9",
            "Shameless",
            "John Wells",
            "United States",
            "2011",
            "Chicagoan Frank Gallagher is the proud single dad of six smart, industrious, independent kids, who without him would be... perhaps better off. When Frank's not at the bar spending what little money they have, he's passed out on the floor. But the kids have found ways to grow up in spite of him. They may not be like any family you know, but they make no apologies for being exactly who they are.",
                listOf("Drama", "Komedi"),
                R.drawable.tv_poster_shameless
        ))
        listTvshow.add(MovieEntity(
            "t10",
            "The Simpson",
            "Matt Groening",
            "United States",
            "1989",
            "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                listOf("Family", "Animation", "Comedy"),
                R.drawable.tv_poster_the_simpson
        ))

        return listTvshow
    }
}