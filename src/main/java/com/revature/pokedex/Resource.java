package com.revature.pokedex;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;

public class Resource {
    public class APIResource {
        // The URL of the referenced resource.
        private String url;

        // Check if this object has already been fetched from the API
        private boolean is_fetched;

        public String getUrl() {
            return url;
        }

        public APIResource setUrl(String url) {
            this.url = url;
            return this;
        }

        public boolean getIsFetched() {
            return is_fetched;
        }

        public APIResource setIsFetched(boolean is_fetched) {
            this.is_fetched = is_fetched;
            return this;
        }

        public class NamedAPIResource extends APIResource {
            // The name of the referenced resource.
            private String name;

            public String getName() {
                return name;
            }

            public NamedAPIResource setName(String name) {
                this.name = name;
                return this;
            }
        }

        public class NamedAPIResourceList {
            // The total number of resources available from this API.
            private int count;

            // The URL for the next page in the list.
            private String next;

            // The URL for the previous page in the list.
            private boolean previous;

            // A list of named API resources.
            private ArrayList<NamedAPIResource> results;

            public int getCount() {
                return count;
            }

            public NamedAPIResourceList setCount(int count) {
                this.count = count;
                return this;
            }

            public String getNext() {
                return next;
            }

            public NamedAPIResourceList setNext(String next) {
                this.next = next;
                return this;
            }

            public boolean getPrevious() {
                return previous;
            }

            public NamedAPIResourceList setPrevious(boolean previous) {
                this.previous = previous;
                return this;
            }

            public ArrayList<NamedAPIResource> getResults() {
                return results;
            }

            public NamedAPIResourceList setResults(ArrayList<NamedAPIResource> results) {
                this.results = results;
                return this;
            }


            public static Class<NamedAPIResourceList> getList(String endpoint, int limit, int offset) {
                String json = Information.fromInternet("https://pokeapi.co/api/v2/" + endpoint + "/?limit=" + Math.abs(limit) + "&offset=" + Math.abs(offset));return (NamedAPIResourceList.class);
            }


            // responsible for grabbing the information from either the online api or the local db (cache)
            public class Information {

                private static String get(BufferedReader bufferedReader) {
                    try {
                        StringBuilder stringBuilder = new StringBuilder();

                        String inputLine;
                        while ((inputLine = bufferedReader.readLine()) != null) {
                            stringBuilder.append(inputLine);
                            stringBuilder.append(System.lineSeparator());
                        }

                        bufferedReader.close();
                        return stringBuilder.toString().trim();
                    } catch (Exception e) {
                        e.printStackTrace();
                        return "";
                    }
                }

                public static String fromInternet(String targetURL) {
                    String str;

                    try {
                        System.setProperty("http.agent", "Chrome");
                        URL url = new URL(targetURL);
                        BufferedReader bufferedReader = new BufferedReader(
                                new InputStreamReader(url.openStream()));

                        str = Information.get(bufferedReader);

                    } catch (Exception e) {//e.printStackTrace();
                        System.out.println("COULDN'T REACH API");
                        return "";
                    }
                    return str;
                }
            }

        }}}
