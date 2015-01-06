package cn.flaty.nio;

import java.nio.ByteBuffer;


public interface ByteBuf {

	
	public static int BUFFER_SIZE = 5;

	public  ByteBuf clear() ;

	public  ByteBuf flip();

	public ByteBuf  position(int i) ;

	public int  position() ;
	
	public ByteBuf  limit(int i) ;

	public int  limit() ;
	
	public int  remaining() ;

	public int  capacity();

	public  ByteBuf put(byte src[]);
	
	public  ByteBuf get(byte dst[]);
	
	 public ByteBuf get(byte[] dst, int offset, int length) ;
	
	public int nioBufferSize();
	
	public ByteBuffer nioBuffer();
	
	public ByteBuffer[] nioBuffers();
	

}