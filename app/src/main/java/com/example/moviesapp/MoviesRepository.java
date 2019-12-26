package com.example.moviesapp;

import java.util.ArrayList;
import java.util.List;

public class MoviesRepository {


    public static List<Movie> movies = new ArrayList<>();


    public static List<Movie> createMovies() {

        movies.add(new Movie("Parfume", "2006", "https://m.media-amazon.com/images/M/MV5BMTI0NjUyMTk3Nl5BMl5BanBnXkFtZTcwOTA5MzkzMQ@@._V1_UX182_CR0,0,182,268_AL_.jpg", "Story", false));
        movies.add(new Movie("Harry Potter and the Sorcerer's Stone", "2001", "https://m.media-amazon.com/images/M/MV5BNjQ3NWNlNmQtMTE5ZS00MDdmLTlkZjUtZTBlM2UxMGFiMTU3XkEyXkFqcGdeQXVyNjUwNzk3NDc@._V1_UX182_CR0,0,182,268_AL_.jpg", "Story", false));
        movies.add(new Movie("Harry Potter and the Chamber of Secrets", "2002", "https://m.media-amazon.com/images/M/MV5BMTcxODgwMDkxNV5BMl5BanBnXkFtZTYwMDk2MDg3._V1_UX182_CR0,0,182,268_AL_.jpg", "Story", false));
        movies.add(new Movie("Harry Potter and the Prisoner of Azkaban", "2004", "https://m.media-amazon.com/images/M/MV5BMTY4NTIwODg0N15BMl5BanBnXkFtZTcwOTc0MjEzMw@@._V1_UX182_CR0,0,182,268_AL_.jpg", "Story", false));
        movies.add(new Movie("Harry Potter and the Goblet of Fire", "2005", "https://m.media-amazon.com/images/M/MV5BMTI1NDMyMjExOF5BMl5BanBnXkFtZTcwOTc4MjQzMQ@@._V1_UX182_CR0,0,182,268_AL_.jpg", "Story", false));
        movies.add(new Movie("Harry Potter and the Order of the Phoenix", "2007", "https://m.media-amazon.com/images/M/MV5BMTM0NTczMTUzOV5BMl5BanBnXkFtZTYwMzIxNTg3._V1_UX182_CR0,0,182,268_AL_.jpg", "Story", false));
        movies.add(new Movie("Harry Potter and the Half-Blood Prince", "2009", "https://m.media-amazon.com/images/M/MV5BNzU3NDg4NTAyNV5BMl5BanBnXkFtZTcwOTg2ODg1Mg@@._V1_UX182_CR0,0,182,268_AL_.jpg", "Story", false));
        movies.add(new Movie("Harry Potter and the Deathly Hallows: Part 1", "2010", "https://m.media-amazon.com/images/M/MV5BMTQ2OTE1Mjk0N15BMl5BanBnXkFtZTcwODE3MDAwNA@@._V1_UX182_CR0,0,182,268_AL_.jpg", "Story", false));
        movies.add(new Movie("Harry Potter and the Deathly Hallows: Part 2", "2011", "https://m.media-amazon.com/images/M/MV5BMjIyZGU4YzUtNDkzYi00ZDRhLTljYzctYTMxMDQ4M2E0Y2YxXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_UX182_CR0,0,182,268_AL_.jpg", "Story", false));
        movies.add(new Movie("The Hobbit: An Unexpected Journey", "2012", "https://m.media-amazon.com/images/M/MV5BMTcwNTE4MTUxMl5BMl5BanBnXkFtZTcwMDIyODM4OA@@._V1_UX182_CR0,0,182,268_AL_.jpg", "Story", false));

        movies.add(new Movie("Mission: Impossible","1996","https://m.media-amazon.com/images/M/MV5BMTc3NjI2MjU0Nl5BMl5BanBnXkFtZTgwNDk3ODYxMTE@._V1_UX182_CR0,0,182,268_AL_.jpg","Action", false));
        movies.add(new Movie("Mission: Impossible II","2000","https://m.media-amazon.com/images/M/MV5BN2RkYWVkZDQtNTMxMi00NWQ4LWE2ODctNmQzOWM2NjQzYzdlXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX182_CR0,0,182,268_AL_.jpg","Action", false));
        movies.add(new Movie("Mission: Impossible III","2006","https://m.media-amazon.com/images/M/MV5BOThhNTA1YjItYzk2Ny00M2Y1LWJlYWUtZDQyZDU0YmY5Y2M5XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX182_CR0,0,182,268_AL_.jpg","Action", false));
        movies.add(new Movie("Mission: Impossible - Ghost Protocol","2011","https://m.media-amazon.com/images/M/MV5BMTY4MTUxMjQ5OV5BMl5BanBnXkFtZTcwNTUyMzg5Ng@@._V1_UX182_CR0,0,182,268_AL_.jpg","Action", false));
        movies.add(new Movie("Mission: Impossible - Rogue Nation","2015","https://m.media-amazon.com/images/M/MV5BOTFmNDA3ZjMtN2Y0MC00NDYyLWFlY2UtNTQ4OTQxMmY1NmVjXkEyXkFqcGdeQXVyNTg4NDQ4NDY@._V1_UX182_CR0,0,182,268_AL_.jpg","Action", false));
        movies.add(new Movie("Mission: Impossible - Fallout","2018","https://m.media-amazon.com/images/M/MV5BNjRlZmM0ODktY2RjNS00ZDdjLWJhZGYtNDljNWZkMGM5MTg0XkEyXkFqcGdeQXVyNjAwMjI5MDk@._V1_UX182_CR0,0,182,268_AL_.jpg","Action", false));
        movies.add(new Movie("Casino Royale","2006","https://m.media-amazon.com/images/M/MV5BMDI5ZWJhOWItYTlhOC00YWNhLTlkNzctNDU5YTI1M2E1MWZhXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_UX182_CR0,0,182,268_AL_.jpg","Action", false));
        movies.add(new Movie("Skyfall ","2012","https://m.media-amazon.com/images/M/MV5BNDVhZmJiYWMtNmIzMC00ZWNiLTkzZDYtNGNlZmViMGM4OGExXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_UX182_CR0,0,182,268_AL_.jpg","Action", false));


        movies.add(new Movie("American Pie","1992","https://m.media-amazon.com/images/M/MV5BMTg3ODY5ODI1NF5BMl5BanBnXkFtZTgwMTkxNTYxMTE@._V1_UX182_CR0,0,182,268_AL_.jpg","Comedy", false));
        movies.add(new Movie("EuroTrip","2004","https://m.media-amazon.com/images/M/MV5BMTIxNjcxMDUxN15BMl5BanBnXkFtZTYwNjAxNTM3._V1_UY268_CR0,0,182,268_AL_.jpg","Comedy", false));
        movies.add(new Movie("Harold & Kumar Go to White Castle ","2004","https://m.media-amazon.com/images/M/MV5BMDc2M2I5MDQtNzliMS00ZmFjLWJmNzEtMTQwYTkxOWI4YzJlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_UX182_CR0,0,182,268_AL_.jpg","Comedy", false));
        movies.add(new Movie("American Pie 2","2001","https://m.media-amazon.com/images/M/MV5BOTEyYjhiMjYtNjU3YS00NmQ4LTlhNTEtYTczNWY3MGJmNzE2XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg","Comedy", false));
        movies.add(new Movie("Scary Movie","2000","https://m.media-amazon.com/images/M/MV5BMGEzZjdjMGQtZmYzZC00N2I4LThiY2QtNWY5ZmQ3M2ExZmM4XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg","Comedy", false));
        movies.add(new Movie("White Chicks","2004","https://m.media-amazon.com/images/M/MV5BMTY3OTg2OTM3OV5BMl5BanBnXkFtZTYwNzY5OTA3._V1_UX182_CR0,0,182,268_AL_.jpg","Comedy", false));
        movies.add(new Movie("The Nutty Professor","1996","https://m.media-amazon.com/images/M/MV5BMTcwODlmZDktNWRkOC00NTFlLTkyMjQtYWUxMzZkNDE4MGVmXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_UX182_CR0,0,182,268_AL_.jpg","Comedy", false));
        movies.add(new Movie("Coming to America","1988","https://m.media-amazon.com/images/M/MV5BNGZlNjdlZmMtYTg0MC00MmZkLWIyNDktYmNlOWYzMTkzYWQ1XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_UX182_CR0,0,182,268_AL_.jpg","Comedy", false));
        movies.add(new Movie("Beverly Hills Cop","1984","https://m.media-amazon.com/images/M/MV5BN2MyZDE0YjAtNWFjYy00MWRlLTk3MTktMzY3ZDVhNTJkZTlmXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_UY268_CR2,0,182,268_AL_.jpg","Comedy", false));

        return movies;
    }


}
