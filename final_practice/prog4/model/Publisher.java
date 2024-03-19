package final_practice.prog4.model;

import java.util.Objects;

public class Publisher {
    private Integer publisherId;
    private String name;

    public Publisher(Integer publisherId, String name) {
        this.publisherId = publisherId;
        this.name = name;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Publisher [publisherId=" + publisherId + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(publisherId, publisher.publisherId) && Objects.equals(name, publisher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisherId, name);
    }
}
