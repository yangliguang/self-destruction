package common;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年11月10日上午9:09:48
 */
public class HashConstants {
	final static public int table_count = 20;//hash表的个数
	final static public int hash_count = 100;//每个hash表值的个数
	final static public int message_count = 1000;//总的消息数目
	final static public int min_k = 1;//设定消息可解密次数最小值
	final static public int max_k = 5;//设定消息可解密次数最大值
	final static public int min_t = 1;//设定消息可解密时间最小值(距发信时间)
	final static public int max_t = 5;//设定消息可解密时间最大值(距发信时间)
	
	//排队规则，首更新，尾插入为1，尾插入，首插入为2
	final static public int queue_rule = 1;
	
	//均匀分布
	final static public int post_frequency = 30;//post消息频率，eg.每分钟30次
	final static public int read_frequency = 75;//读消息频率，eg.每分钟30次
	//泊松分布
	final static public double post_poisson_lamda = 30;
	final static public double read_poisson_lamda = 75;
	//统计
	//统计前N行的lifetime(erase_time - post_time)
	final static public int lifetime_lines = 10000;
	
	//统计队长 多个时间点的间隔 分钟
	final static public int interval_count_queue_length = 20;
	
}
