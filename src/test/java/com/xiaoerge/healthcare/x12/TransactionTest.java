package com.xiaoerge.healthcare.x12;

import com.xiaoerge.healthcare.x12.control.Transaction;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by xiaoerge on 5/23/16.
 */
public class TransactionTest {

    @Test
    public void testParseTransaction() {
        String x12 = "ST***~BHT*\\*\\*\\*\\*\\*\\*\\*~SE**~";
        Transaction transaction = new Transaction(x12);

        Assert.assertFalse(transaction.validate());
        Assert.assertNotEquals(x12, transaction.toX12String());
    }

    @Test
    public void testCreateTransaction() {
        String x12 = "ST***~BHT******~SE**~";
        Transaction transaction = new Transaction();

        Assert.assertTrue(transaction.validate());
        Assert.assertEquals(x12, transaction.toX12String());
    }
}