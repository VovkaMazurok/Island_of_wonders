package Entity.Map;


//public class JsonFile {
//
//    String path = "src/Parameters/Characteristics_of_animals.json";
//
//        public void readJsonFile() {
//            String path = "src/Parameters/Characteristics_of_animals.json";
//            try {
//                BufferedReader reader = new BufferedReader(new FileReader(path));
//                StringBuilder sb = new StringBuilder();
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    sb.append(line);
//                }
//                reader.close();
//                ObjectMapper objectMapper = new ObjectMapper();
//                System.out.println(objectMapper.toString()); // pretty print JSON
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public static ImmutableList<Organism> getPeople() throws IOException {
//
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        InputStream inputStream = Organism.class.("people.json").openStream();
//        List<Person> people = objectMapper.readValue(inputStream, new TypeReference<List<Person>>() {
//        });
//
//        return ImmutableList.copyOf(people);
//
//    }


