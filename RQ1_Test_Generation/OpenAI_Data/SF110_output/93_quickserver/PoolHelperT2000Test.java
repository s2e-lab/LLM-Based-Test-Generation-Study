// PoolHelperTest.java
package org.quickserver.util.pool;

import org.apache.commons.pool.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PoolHelper}.
* It contains ten unit test cases for the {@link PoolHelper#isPoolOpen(ObjectPool)} method.
*/
class PoolHelperTest {

	@Test
	void testIsPoolOpen() {
		ObjectPool pool = new BaseObjectPool() {
			public Object borrowObject() throws Exception {
				return null;
			}
			public void returnObject(Object obj) throws Exception {
			}
			public void invalidateObject(Object obj) throws Exception {
			}
			public void addObject() throws Exception {
			}
			public int getNumIdle() throws UnsupportedOperationException {
				return 0;
			}
			public int getNumActive() throws UnsupportedOperationException {
				return 0;
			}
			public void clear() throws Exception, UnsupportedOperationException {
			}
			public void close() {
			}
		};
		assertTrue(PoolHelper.isPoolOpen(pool));
		
		pool = new BaseObjectPool() {
			public Object borrowObject() throws Exception {
				return null;
			}
			public void returnObject(Object obj) throws Exception {
			}
			public void invalidateObject(Object obj) throws Exception {
			}
			public void addObject() throws Exception {
			}
			public int getNumIdle() throws UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public int getNumActive() throws UnsupportedOperationException {
				return 0;
			}
			public void clear() throws Exception, UnsupportedOperationException {
			}
			public void close() {
			}
		};
		assertTrue(PoolHelper.isPoolOpen(pool));
		
		pool = new BaseObjectPool() {
			public Object borrowObject() throws Exception {
				return null;
			}
			public void returnObject(Object obj) throws Exception {
			}
			public void invalidateObject(Object obj) throws Exception {
			}
			public void addObject() throws Exception {
			}
			public int getNumIdle() throws UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public int getNumActive() throws UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public void clear() throws Exception, UnsupportedOperationException {
			}
			public void close() {
			}
		};
		assertTrue(PoolHelper.isPoolOpen(pool));
		
		pool = new BaseObjectPool() {
			public Object borrowObject() throws Exception {
				return null;
			}
			public void returnObject(Object obj) throws Exception {
			}
			public void invalidateObject(Object obj) throws Exception {
			}
			public void addObject() throws Exception {
			}
			public int getNumIdle() throws UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public int getNumActive() throws UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public void clear() throws Exception, UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public void close() {
			}
		};
		assertTrue(PoolHelper.isPoolOpen(pool));
		
		pool = new BaseObjectPool() {
			public Object borrowObject() throws Exception {
				return null;
			}
			public void returnObject(Object obj) throws Exception {
			}
			public void invalidateObject(Object obj) throws Exception {
			}
			public void addObject() throws Exception {
			}
			public int getNumIdle() throws UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public int getNumActive() throws UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public void clear() throws Exception, UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public void close() {
				throw new UnsupportedOperationException();
			}
		};
		assertTrue(PoolHelper.isPoolOpen(pool));
		
		pool = new BaseObjectPool() {
			public Object borrowObject() throws Exception {
				return null;
			}
			public void returnObject(Object obj) throws Exception {
			}
			public void invalidateObject(Object obj) throws Exception {
			}
			public void addObject() throws Exception {
			}
			public int getNumIdle() throws UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public int getNumActive() throws UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public void clear() throws Exception, UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public void close() {
				throw new UnsupportedOperationException();
			}
			public void setFactory(PoolableObjectFactory factory) throws IllegalStateException, UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
		};
		assertTrue(PoolHelper.isPoolOpen(pool));
		
		pool = new BaseObjectPool() {
			public Object borrowObject() throws Exception {
				return null;
			}
			public void returnObject(Object obj) throws Exception {
			}
			public void invalidateObject(Object obj) throws Exception {
			}
			public void addObject() throws Exception {
			}
			public int getNumIdle() throws UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public int getNumActive() throws UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public void clear() throws Exception, UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public void close() {
				throw new UnsupportedOperationException();
			}
			public void setFactory(PoolableObjectFactory factory) throws IllegalStateException, UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public PoolableObjectFactory getFactory() {
				throw new UnsupportedOperationException();
			}
		};
		assertTrue(PoolHelper.isPoolOpen(pool));
		
		pool = new BaseObjectPool() {
			public Object borrowObject() throws Exception {
				return null;
			}
			public void returnObject(Object obj) throws Exception {
			}
			public void invalidateObject(Object obj) throws Exception {
			}
			public void addObject() throws Exception {
			}
			public int getNumIdle() throws UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public int getNumActive() throws UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public void clear() throws Exception, UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public void close() {
				throw new UnsupportedOperationException();
			}
			public void setFactory(PoolableObjectFactory factory) throws IllegalStateException, UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
			public PoolableObjectFactory getFactory