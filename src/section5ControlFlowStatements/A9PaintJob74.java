package section5ControlFlowStatements;

public class A9PaintJob74 {

	public static void main(String[] args) {
		System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));

	}
	public static int getBucketCount(double width,
									double height,
									double areaPerBucket,
									int extraBuckets) {
		double Buckets = 0.0;
		double area;
		if(width <=0 || height <= 0 || areaPerBucket <=0 || extraBuckets <0)
			return -1;
		area = width * height;
		Buckets = area / areaPerBucket;
		Buckets = Math.ceil(Buckets);
		Buckets = Buckets - extraBuckets;
		
		return (int)Buckets;
	}
	public static int getBucketCount(double width,
									double height,
									double areaPerBucket) {
		double Buckets = 0.0;
		double area;
		if(width <=0 || height <= 0 || areaPerBucket <=0 )
			return -1;
		area = width * height;
		Buckets = area / areaPerBucket;
		Buckets = Math.ceil(Buckets);

		return (int)Buckets;
	}
	public static int getBucketCount(double area, double areaPerBucket) {
		double Buckets = 0.0;
		if(area <= 0 || areaPerBucket <=0 )
			return -1;
		
		Buckets = area / areaPerBucket;
		Buckets = Math.ceil(Buckets);

		return (int)Buckets;
	}
}
