/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic.hust.multiple.choise.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sic.hust.multiple.choise.dao.DBConnection;
import sic.hust.multiple.choise.model.Topic;
import sic.hust.multiple.choise.service.ITopicService;

/**
 *
 * @author Mr Loi Ho
 */
public class TopicServiceImpl implements ITopicService {

    DBConnection dao = new DBConnection();

    @Override
    public List<Topic> findAllTopics() {
        List<Topic> topics = new ArrayList<Topic>();
        try {
            topics = dao.findAllTopics();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return topics;
    }

    @Override
    public Topic findTopicById(int id) {
        Topic topic = new Topic();
        try {
            topic = dao.findTopicById(id);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return topic;
    }
    
}
