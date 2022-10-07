package com.arcapp.moviesapp.data

import android.os.Parcelable
import com.google.gson.Gson
import kotlinx.parcelize.Parcelize

/*
    On this page, we have prepared a model that will hold the movies.
*/

@Parcelize
data class MovieModel(
    val id: Int,
    val name: String,
    val year: Int,
    val description: String,
    val imdb: Float,
    val image: String,
    val artistList: MutableList<ArtistModel>
) : Parcelable {

    // json convert method
    fun toJson(): String {
        return Gson().toJson(this)
    }

    // static json object
    companion object {
        fun fromJson(jsonValue: String): MovieModel {
            return Gson().fromJson(jsonValue, MovieModel::class.java)
        }
    }

}

// We created fake data

val mockMovieData = mutableListOf<MovieModel>(
    MovieModel(
        1,
        "Fight Club",
    1999,
        "A young man leads a pretty humdrum life assessing car crashes to determine if his automobile company should issue recalls to fix problems. He also suffers from insomnia and takes to attending group therapy sessions for people who have survived various diseases. There he meets Marla who like him attends these sessions though she is neither a victim nor a survivor. His life changes when he meets Tyler Durden on a flight home. Tyler seems to be everything that he's not and together they create a men-only group for bare-knuckle fighting. It soon becomes all the rage with fight clubs springing up across the country and the group itself becoming an anti-capitalist domestic terrorist organization. Tyler and Marla develop a relationship leaving him often on the outside of what is going on. He soon finds that the group is out of control and after a major self-revelation decides there is only one way out. ",
        8.8f,
        "https://m.media-amazon.com/images/M/MV5BNDIzNDU0YzEtYzE5Ni00ZjlkLTk5ZjgtNjM3NWE4YzA3Nzk3XkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_.jpg",
        mutableListOf(
            ArtistModel("Edward Norton","https://i1.wp.com/filmloverss.com/wp-content/uploads/2016/11/edward-norton-filmloverss.jpg?fit=720%2C400&ssl=1"),
            ArtistModel("Brad Pitt","https://tr.web.img3.acsta.net/pictures/19/05/22/10/42/3773139.jpg"),
            ArtistModel("Helena Bonham Carter","https://upload.wikimedia.org/wikipedia/commons/7/7a/Helena_Bonham_Carter_%28Berlin_Film_Festival_2011%29_3_cropped.jpg"),
            ArtistModel("Jared Leto","https://media.bantmag.com/wp-content/uploads/2020/12/pjimage-10-800x533.jpg")
        )
    ),
    MovieModel(
        2,
        "The Dark Knight",
        2008,
        "Set within a year after the events of Batman Begins (2005), Batman, Lieutenant James Gordon, and new District Attorney Harvey Dent successfully begin to round up the criminals that plague Gotham City, until a mysterious and sadistic criminal mastermind known only as \"The Joker\" appears in Gotham, creating a new wave of chaos. Batman's struggle against The Joker becomes deeply personal, forcing him to \"confront everything he believes\" and improve his technology to stop him. A love triangle develops between Bruce Wayne, Dent, and Rachel Dawes.",
        9.0f,
        "https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_.jpg",
        mutableListOf(
            ArtistModel("Christian Bale","https://upload.wikimedia.org/wikipedia/commons/0/0a/Christian_Bale-7837.jpg"),
            ArtistModel("Heath Ledger","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Heath_Ledger.jpg/640px-Heath_Ledger.jpg"),
            ArtistModel("Gary Oldman","https://tr.web.img3.acsta.net/pictures/16/03/18/16/03/398105.jpg"),
            ArtistModel("Aaron Eckhart","https://static.wikia.nocookie.net/batman/images/d/d4/AaronEckhart.jpg/revision/latest/top-crop/width/360/height/450?cb=20101202222302")
        )
    ),
    MovieModel(
        3,
        "Reservoir Dogs",
        1992,
        "Six thugs, who are strangers to each other, are hired by a crime boss, Joe Cabot, to carry out a diamond robbery. Right at the outset, they are given false names with the intention that they won't get too close and will concentrate on the job instead. They are completely sure that the robbery is going to be a success. But, when the police show up right at the time and the site of the robbery, panic spreads amongst the group members, and two of them are killed in the subsequent shootout, along with a few policemen and civilians. When the remaining people assemble at the premeditated rendezvous point (a warehouse), they begin to suspect that one of them is an undercover cop.",
        8.3f,
        "https://m.media-amazon.com/images/M/MV5BZmExNmEwYWItYmQzOS00YjA5LTk2MjktZjEyZDE1Y2QxNjA1XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_FMjpg_UX1000_.jpg",
        mutableListOf(
            ArtistModel("Quentin Tarantino","https://fr.web.img3.acsta.net/pictures/19/05/22/10/33/5945451.jpg"),
            ArtistModel("Harvey Keitel","https://upload.wikimedia.org/wikipedia/commons/f/f5/Harvey_Keitel_Cannes_2015.jpg"),
            ArtistModel("Michael Madsen","https://m.media-amazon.com/images/M/MV5BMTI4ODA5NzY2N15BMl5BanBnXkFtZTYwNjc3NTI1._V1_.jpg"),
            ArtistModel("Tim Roth","https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Tim_Roth_by_Gage_Skidmore_2.jpg/800px-Tim_Roth_by_Gage_Skidmore_2.jpg")
        )
    ),
    MovieModel(
        10,
        "Avatar",
        2009,
        "When his brother is killed in a robbery, paraplegic Marine Jake Sully decides to take his place in a mission on the distant world of Pandora. There he learns of greedy corporate figurehead Parker Selfridge's intentions of driving off the native humanoid \"Na'vi\" in order to mine for the precious material scattered throughout their rich woodland. In exchange for the spinal surgery that will fix his legs, Jake gathers knowledge, of the Indigenous Race and their Culture, for the cooperating military unit spearheaded by gung-ho Colonel Quaritch, while simultaneously attempting to infiltrate the Na'vi people with the use of an \"avatar\" identity. While Jake begins to bond with the native tribe and quickly falls in love with the beautiful alien Neytiri, the restless Colonel moves forward with his ruthless extermination tactics, forcing the soldier to take a stand - and fight back in an epic battle for the fate of Pandora.",
        7.8f,
        "https://m.media-amazon.com/images/M/MV5BNjA3NGExZDktNDlhZC00NjYyLTgwNmUtZWUzMDYwMTZjZWUyXkEyXkFqcGdeQXVyMTU1MDM3NDk0._V1_FMjpg_UX1000_.jpg",
        mutableListOf(
            ArtistModel("Sam Worthington","https://upload.wikimedia.org/wikipedia/commons/6/6c/Sam_Worthington_2013.jpg"),
            ArtistModel("Giovanni Ribisi","https://www.filmler.com/wp-content/uploads/2020/09/8EAiS9D3YtGOrwNM0OrwmDpWK7s.jpg"),
            ArtistModel("Zoe Saldaña","https://tr.web.img4.acsta.net/pictures/18/05/04/11/38/3895826.jpg"),
            ArtistModel("Sigourney Weaver","https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Sigourney_Weaver_by_Gage_Skidmore.jpg/1200px-Sigourney_Weaver_by_Gage_Skidmore.jpg")
        )
    ),
    MovieModel(
        5,
        "The Prestige",
        2006,
        "In the end of the nineteenth century, in London, Robert Angier, his beloved wife Julia McCullough, and Alfred Borden are friends and assistants of a magician. When Julia accidentally dies during a performance, Robert blames Alfred for her death, and they become enemies. Both become famous and rival magicians, sabotaging the performance of the other on the stage. When Alfred performs a successful trick, Robert becomes obsessed trying to disclose the secret of his competitor with tragic consequences.",
        8.5f,
        "https://tr.web.img3.acsta.net/pictures/bzp/01/108998.jpg",
        mutableListOf(
            ArtistModel("Christian Bale","https://upload.wikimedia.org/wikipedia/commons/0/0a/Christian_Bale-7837.jpg"),
            ArtistModel("Hugh Jackman","https://upload.wikimedia.org/wikipedia/commons/7/77/Logan_Japan_Premiere_Red_Carpet-_Hugh_Jackman_%2838445328406%29_%28rotated%29.jpg"),
            ArtistModel("Michael Caine","https://static.wikia.nocookie.net/kingsman-the-secret-service/images/7/79/5876-michael-caine.jpg/revision/latest/top-crop/width/360/height/450?cb=20170502182532"),
            ArtistModel("Scarlett Johansson","https://insedo.hu/wp-content/uploads/wonderful-scarlett-johansson-beauty-face-look-free-background-hd-desktop-pictures.jpg")
        )
    ),
    MovieModel(
        6,
        "Kung Fu Panda",
        2008,
        "It's the story about a lazy, irreverent slacker panda, named Po, who is the biggest fan of Kung Fu around...which doesn't exactly come in handy while working every day in his family's noodle shop. Unexpectedly chosen to fulfill an ancient prophecy, Po's dreams become reality when he joins the world of Kung Fu and studies alongside his idols, the legendary Furious Five -- Tigress, Crane, Mantis, Viper and Monkey -- under the leadership of their guru, Master Shifu. But before they know it, the vengeful and treacherous snow leopard Tai Lung is headed their way, and it's up to Po to defend everyone from the oncoming threat. Can he turn his dreams of becoming a Kung Fu master into reality? Po puts his heart - and his girth - into the task, and the unlikely hero ultimately finds that his greatest weaknesses turn out to be his greatest strengths.",
        7.6f,
        "https://tr.web.img2.acsta.net/pictures/bzp/01/45889.jpg",
        mutableListOf(
            ArtistModel("Jack Black","https://turkcealtyazi.org/film/nmbig/nm0085312.jpg"),
            ArtistModel("Jackie Chan","https://flxt.tmsimg.com/assets/28555_v9_bc.jpg"),
            ArtistModel("James Hong","https://images.mubicdn.net/images/cast_member/25088/cache-727421-1635329644/image-w856.jpg?size=800x"),
            ArtistModel("Lucy Liu","https://www.gilan.com/wp-content/uploads/2020/09/lucy_liu-1.jpg")
        )
    ),
    MovieModel(
        7,
        "How to Train Your Dragon",
        2010,
        "Long ago up North on the Island of Berk, the young Viking, Hiccup, wants to join his town's fight against the dragons that continually raid their town. However, his macho father and village leader, Stoik the Vast, will not allow his small, clumsy, but inventive son to do so. Regardless, Hiccup ventures out into battle and downs a mysterious Night Fury dragon with his invention, but can't bring himself to kill it. Instead, Hiccup and the dragon, whom he dubs Toothless, begin a friendship that would open up both their worlds as the observant boy learns that his people have misjudged the species. But even as the two each take flight in their own way, they find that they must fight the destructive ignorance plaguing their world.",
        8.1f,
        "https://upload.wikimedia.org/wikipedia/tr/9/99/How_to_Train_Your_Dragon_Poster.jpg",
        mutableListOf(
            ArtistModel("Jay Baruchel","https://m.media-amazon.com/images/M/MV5BMTM5MjY0MzU0OV5BMl5BanBnXkFtZTcwOTE0NDA2NA@@._V1_.jpg"),
            ArtistModel("Gerard Butler","https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Gerard_Butler_%2829681162176%29.jpg/640px-Gerard_Butler_%2829681162176%29.jpg"),
            ArtistModel("America Ferrera","https://m.media-amazon.com/images/M/MV5BMTQyMDUzOTkxNF5BMl5BanBnXkFtZTcwNjMwNjk0OA@@._V1_.jpg"),
            ArtistModel("Kristen Wiig","https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Kristin_Wiig_2013.jpg/640px-Kristin_Wiig_2013.jpg")
        )
    ),
    MovieModel(
        8,
        "World War Z",
        2013,
        "Life for former United Nations investigator Gerry Lane and his family seems content. Suddenly, the world is plagued by a mysterious infection turning whole human populations into rampaging mindless zombies. After barely escaping the chaos, Lane is persuaded to go on a mission to investigate this disease. What follows is a perilous trek around the world where Lane must brave horrific dangers and long odds to find answers before human civilization falls.",
        7.0f,
        "https://de.web.img3.acsta.net/medias/nmedia/18/93/24/74/20524820.jpg",
        mutableListOf(
            ArtistModel("Brad Pitt","https://tr.web.img3.acsta.net/pictures/19/05/22/10/42/3773139.jpg"),
            ArtistModel("Mireille Enos","https://media-cldnry.s-nbcnews.com/image/upload/newscms/2014_10/236626/140307-mireille-enos-307.jpg"),
            ArtistModel("Matthew Fox","https://upload.wikimedia.org/wikipedia/commons/b/b1/MatthewFoxTIFFSept2012.jpg"),
            ArtistModel("Michiel Huisman","https://static.daktilo.com/sites/496/uploads/2021/05/17/rb31d8425e07de9662a831251a1c705a0.jpg")
        )
    ),
    MovieModel(
        9,
        "3 Idiots",
        2009,
        "3 Idiots is a Bollywood production that flashes back and forth between present day, and the characters' time in college. It starts off with old friends, Qureshi and Raju Rastogi learning that their college pal, Rancho, had finally been found. The movie follows their travels to find their long lost friend, while flashing back to the events of their school years, where they often got into amusing shenanigans involving the Dean of Delhi's Imperial College of Engineering, Viru Sahastrabudhe, and dealt with some serious events that many people encounter in every day life.",
        8.4f,
        "https://m.media-amazon.com/images/M/MV5BNTkyOGVjMGEtNmQzZi00NzFlLTlhOWQtODYyMDc2ZGJmYzFhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_.jpg",
        mutableListOf(
            ArtistModel("Aamir Khan","https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Aamir_Khan_%28Berlin_Film_Festival_2011%29.jpg/1200px-Aamir_Khan_%28Berlin_Film_Festival_2011%29.jpg"),
            ArtistModel("R. Madhavan","https://wikibio.in/wp-content/uploads/2019/08/R.-Madhavan.jpg"),
            ArtistModel("Sharman Joshi","https://i2.cinestaan.com/image-bank/1500-1500/134001-135000/134536.jpg"),
            ArtistModel("Kareena Kapoor","https://upload.wikimedia.org/wikipedia/commons/2/26/Kareena_kapoor_vaio_launch.jpg")
        )
    ),
    MovieModel(
        4,
        "Hotel Rwanda",
        2004,
        "1994. In Rwanda, the classification of the native population into Hutus and Tutsis, arbitrarily done by the colonial Belgians, is now ingrained within Rwandan mentality despite the Rwandan independence. Despite the Belgians having placed the Tutsis in a higher position during the Belgian rule, they have placed the majority Hutus in power after independence. Paul Rusesabagina, a Hutu married to a Tutsi, Tatiana Rusesabagina, is the House Manager of the Hotel Des Milles Collines in Kigali. The Milles Collines, owned by Sabena (the national airline of Belgium), is a four-star hotel catering primarily to wealthy white westerners. Paul, who knows how to work the system to run the hotel effectively for its guests and for Sabena, is proud that most of the Caucasians who he meets in this professional capacity treat him with respect. After a specific incident, the relative calm between the Tutsi guerrillas and government-backed Hutu militia takes a turn. Paul's thought that the native population as a whole who are not directly involved in the conflict will be protected as the UN peacekeeping forces and thus the world is watching doesn't happen as the western world largely evacuates from Rwanda and abandons the natives. Such begins what will become a genocide of the Tutsi population. Paul, who is able to get his immediate family to the hotel which is still largely seen as a place of sanctuary, will have to use the considerable skills he has used to run the hotel as well as he has instead to keep himself, his family and any others taking refuge at the hotel alive, whether they be Hutu or Tutsi. Meanwhile, Colonel Oliver, a Canadian heading the UN peacekeeping forces, and Pat Archer with the Red Cross do what they can to assist Paul and to get people to safety first to the hotel then out of the country, while field journalists, like photographer Jack Daglish, try to bring the genocide back into the global media to have the world once again care about what is going on",
        8.1f,
        "https://tr.web.img4.acsta.net/pictures/bzp/01/55666.jpg",
        mutableListOf(
            ArtistModel("Don Cheadle","https://flxt.tmsimg.com/assets/71830_v9_bb.jpg"),
            ArtistModel("Sophie Okonedo","https://flxt.tmsimg.com/assets/163187_v9_bc.jpg"),
            ArtistModel("Nick Nolte","https://flxt.tmsimg.com/assets/71355_v9_bc.jpg"),
            ArtistModel("Joaquin Phoenix","https://tr.web.img3.acsta.net/pictures/17/05/29/11/47/593823.jpg")
        )
    ),
    MovieModel(
        11,
        "I Am Legend",
        2007,
        "Robert Neville (Will Smith) is a scientist who was unable to stop the spread of the terrible virus that was incurable and man-made in this post-apocalyptic action thriller. Immune, Neville is now the last human survivor in what is left of New York City and perhaps the world. For three years, Neville has faithfully sent out daily radio messages, desperate to find any other survivors who might be out there. But he is not alone. Mutant victims of the plague - the Infected - lurk in the shadows - watching Neville's every move - waiting for him to make a fatal mistake. Perhaps mankind's last, best hope, Neville is driven by only one remaining mission: to find a way to reverse the effects of the virus using his own immune blood. But he knows he is outnumbered - and quickly running out of time.",
        7.2f,
        "https://m.media-amazon.com/images/M/MV5BYTE1ZTBlYzgtNmMyNS00ZTQ2LWE4NjEtZjUxNDJkNTg2MzlhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_.jpg",
        mutableListOf(
            ArtistModel("Will Smith","https://upload.wikimedia.org/wikipedia/commons/3/3f/TechCrunch_Disrupt_2019_%2848834434641%29_%28cropped%29.jpg"),
            ArtistModel("Alice Braga","https://img01.imgsinemalar.com/images/artist_buyuk/33823/Alice-Braga-19.jpg"),
            ArtistModel("Charlie Tahan","https://www.filmler.com/wp-content/uploads/2021/12/isCdDBAxrSOjugK3HjgESi6rXcn.jpg"),
            ArtistModel("Willow Smith","https://www.hollywoodreporter.com/wp-content/uploads/2022/08/GettyImages-1228836917.jpg?w=1296")
        )
    ),
    MovieModel(
        12,
        "Forrest Gump",
        1994,
        "Forrest Gump is a simple man with a low I.Q. but good intentions. He is running through childhood with his best and only friend Jenny. His 'mama' teaches him the ways of life and leaves him to choose his destiny. Forrest joins the army for service in Vietnam, finding new friends called Dan and Bubba, he wins medals, creates a famous shrimp fishing fleet, inspires people to jog, starts a ping-pong craze, creates the smiley, writes bumper stickers and songs, donates to people and meets the president several times. However, this is all irrelevant to Forrest who can only think of his childhood sweetheart Jenny Curran, who has messed up her life. Although in the end all he wants to prove is that anyone can love anyone.",
        8.8f,
        "https://upload.wikimedia.org/wikipedia/tr/b/bb/Forrest_Gump_%28film%2C_1994%29.jpg",
        mutableListOf(
            ArtistModel("Tom Hanks","https://upload.suggest.com/sg/uploads/2022/06/tom-hanks-black-suit.jpg"),
            ArtistModel("Robin Wright","https://tr.web.img2.acsta.net/pictures/19/11/05/01/50/2018682.jpg"),
            ArtistModel("Gary Sinise","https://upload.wikimedia.org/wikipedia/commons/9/90/Gary_Sinise_2011_%28cropped%29.jpg"),
            ArtistModel("Sally Field","https://www.biography.com/.image/t_share/MTgwMzQ0ODE5NjQ0OTY2MDM4/gettyimages-694986884.jpg")
        )
    )

)