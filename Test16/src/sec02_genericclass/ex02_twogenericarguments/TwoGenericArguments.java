package sec02_genericclass.ex02_twogenericarguments;


class KeyValue<K, V>{
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}
// 마우스 우클릭 소스 Alt+Shift+S getter setter 세팅 값
public class TwoGenericArguments {

	public static void main(String[] args) {
		
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		kv1.setKey("사과");kv1.setValue(1000);
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		System.out.println("ket : " + key1+ " value : " + value1);
		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setKey(404);
		kv2.setValue("Not Found(요청한 페이지를 찾을 수 없습니다.)");
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		System.out.println("Key : " + key2+" value : " + value2);
		
		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("키 값만 사용");
		String key3 = kv3.getKey();
		System.out.println("Key : " + key3);
		// void는 null밖에 올 수 없다. 문자나 숫자로 입력하면 오류
	}
}