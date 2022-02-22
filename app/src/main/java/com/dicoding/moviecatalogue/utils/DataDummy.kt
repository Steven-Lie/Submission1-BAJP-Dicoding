package com.dicoding.moviecatalogue.utils

import com.dicoding.moviecatalogue.R
import com.dicoding.moviecatalogue.data.CatalogueEntity

object DataDummy {
    fun generateMovie(): List<CatalogueEntity> {
        val movies = ArrayList<CatalogueEntity>()

        movies.add(
            CatalogueEntity(
                0,
                "A Star Is Born",
                "05 October 2018",
                "Drama, Romance",
                "2h 16m",
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. " +
                        "She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. " +
                        "But even as Ally's career takes off, the personal side of their relationship is breaking down, " +
                        "as Jack fights an ongoing battle with his own internal demons.",
                R.drawable.poster_a_star_is_born
            )
        )

        movies.add(
            CatalogueEntity(
                1,
                "Alita: Battle Angel",
                "14 February 2019",
                "Action, Science, Fiction, Adventure",
                "2h 2m",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, " +
                        "she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned " +
                        "cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                R.drawable.poster_alita
            )
        )

        movies.add(
            CatalogueEntity(
                2,
                "Aquaman",
                "26 December 2018",
                "Action, Adventure, Fantasy",
                "2h 23m",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled " +
                        "by the power-hungry King Orm. With a vast army at his disposal, " +
                        "Orm plans to conquer the remaining oceanic people and then the surface world. " +
                        "Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                R.drawable.poster_aquaman
            )
        )

        movies.add(
            CatalogueEntity(
                3,
                "Bohemian Rhapsody",
                "30 October 2018",
                "Music, Drama, History",
                "2h 15m",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist " +
                        "John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. " +
                        "Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, " +
                        "Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                R.drawable.poster_bohemian
            )
        )

        movies.add(
            CatalogueEntity(
                4,
                "Cold Pursuit",
                "08 February 2019",
                "Action, Crime, Thriller",
                "1h 59m",
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. " +
                        "Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, " +
                        "eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more " +
                        "unexpected and violent consequences, as he proves that revenge is all in the execution.",
                R.drawable.poster_cold_pursuit
            )
        )

        movies.add(
            CatalogueEntity(
                5,
                "Creed II",
                "20 November 2018",
                "Drama",
                "2h 10m",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, " +
                        "Adonis Creed is up against the challenge of his life.",
                R.drawable.poster_creed
            )
        )

        movies.add(
            CatalogueEntity(
                6,
                "Glass",
                "18 January 2019",
                "Thriller, Drama, Science Fiction",
                "2h 9m",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities " +
                        "to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, " +
                        "the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                R.drawable.poster_glass
            )
        )

        movies.add(
            CatalogueEntity(
                7,
                "How to Train Your Dragon: the Hidden World",
                "09 January 2019",
                "Animation, Family, Adventure",
                "1h 44m",
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, " +
                        "elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, " +
                        "both dragon and rider must make impossible decisions to save their kind.",
                R.drawable.poster_how_to_train
            )
        )

        movies.add(
            CatalogueEntity(
                8,
                "Avengers: Infinity War",
                "27 April 2018",
                "Adventure, Action, Science, Fiction",
                "2h 29m",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, " +
                        "a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, " +
                        "his goal is to collect all six Infinity Stones, artifacts of unimaginable power, " +
                        "and use them to inflict his twisted will on all of reality. Everything the Avengers have fought " +
                        "for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                R.drawable.poster_infinity_war
            )
        )

        movies.add(
            CatalogueEntity(
                9,
                "Overlord",
                "09 November 2018",
                "Horror, War, Science Fiction",
                "1h 50m",
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines" +
                        " after their aircraft crashes while on a mission to destroy a radio tower in a small village" +
                        " near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, " +
                        "in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                R.drawable.poster_overlord
            )
        )

        return movies
    }

    fun generateTvShow(): List<CatalogueEntity> {
        val tv = ArrayList<CatalogueEntity>()

        tv.add(
            CatalogueEntity(
                0,
                "Arrow",
                "10 October 2012",
                "Crime, Drama, Mystery, Action & Adventure",
                "42m",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. " +
                        "He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                R.drawable.poster_arrow
            )
        )

        tv.add(
            CatalogueEntity(
                1,
                "Doom Patrol",
                "15 February 2019",
                "Sci-Fi & Fantasy, Drama",
                "49m",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — " +
                        "but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, " +
                        "who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                R.drawable.poster_doom_patrol
            )
        )

        tv.add(
            CatalogueEntity(
                2,
                "Family Guy",
                "31 January 1999",
                "Animation, Comedy",
                "22m",
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures " +
                        "of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. " +
                        "Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), " +
                        "Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very " +
                        "bright but has a passion for movies). The final member of the family is Brian - a talking dog and much " +
                        "more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                R.drawable.poster_family_guy
            )
        )

        tv.add(
            CatalogueEntity(
                3,
                "The Flash",
                "07 October 2014",
                "Drama, Sci-Fi & Fantasy",
                "44m",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by " +
                        "lightning and falls into a coma. Months later he awakens with the power of super speed, " +
                        "granting him the ability to move through Central City like an unseen guardian angel. " +
                        "Though initially excited by his newfound powers, Barry is shocked to discover he is not " +
                        "the only \"meta-human\" who was created in the wake of the accelerator explosion -- " +
                        "and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and " +
                        "dedicates his life to protect the innocent. For now, only a few close friends and associates " +
                        "know that Barry is literally the fastest man alive, but it won't be long before the world learns " +
                        "what Barry Allen has become...The Flash.",
                R.drawable.poster_flash
            )
        )

        tv.add(
            CatalogueEntity(
                4,
                "Gotham",
                "22 September 2014",
                "Drama, Crime, Sci-Fi & Fantasy",
                "43m",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, " +
                        "a man whose reputation is synonymous with law and order. But what is known of Gordon's story and " +
                        "his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple " +
                        "layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? " +
                        "And what circumstances created them – the larger-than-life personas who would become Catwoman, " +
                        "The Penguin, The Riddler, Two-Face and The Joker?",
                R.drawable.poster_gotham
            )
        )

        tv.add(
            CatalogueEntity(
                5,
                "Grey's Anatomy",
                "27 March 2005",
                "Drama",
                "43m",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                R.drawable.poster_grey_anatomy
            )
        )

        tv.add(
            CatalogueEntity(
                6,
                "Marvel's Iron Fist",
                "17 March 2017",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "55m",
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, " +
                        "he seeks to reclaim his past and fulfill his destiny.",
                R.drawable.poster_iron_fist
            )
        )

        tv.add(
            CatalogueEntity(
                7,
                "NCIS",
                "23 September 2003",
                "Crime, Action & Adventure, Drama",
                "45m",
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any " +
                        "crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                R.drawable.poster_ncis
            )
        )

        tv.add(
            CatalogueEntity(
                8,
                "Supernatural",
                "13 September 2005",
                "Drama, Mystery, Sci-fi & Fantasy",
                "45m",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. " +
                        "Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that " +
                        "lives in the dark corners and on the back roads of America ... and he taught them how to kill it. " +
                        "Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of " +
                        "supernatural threat they encounter along the way.",
                R.drawable.poster_supernatural
            )
        )

        tv.add(
            CatalogueEntity(
                9,
                "The Umbrella Academy",
                "15 February 2019",
                "Action & Adventure, Sci-Fi & Fantasy, Drama",
                "55m",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, " +
                        "the threat of the apocalypse and more.",
                R.drawable.poster_the_umbrella
            )
        )

        return tv
    }
}