class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.getOrDefault(words[i],0)+1);
            }
            else{
                map.put(words[i],1);
            }
        }
        ArrayList<String>list=new ArrayList<>();
        for(String word:map.keySet()){
            list.add(word);
        }
        Collections.sort(list,(a,b)->{
            if(map.get(a)!=map.get(b)){
                return map.get(b)-map.get(a);
            }
            return a.compareTo(b);
        });

        return list.subList(0,k);
    }
}