package royaleserver.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "arenas")
@NamedQueries({
		@NamedQuery(name = "ArenaEntity.all", query = "SELECT arenaEntity FROM ArenaEntity arenaEntity"),
})
public class ArenaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false, unique = true)
	private String name;


	public long getId() {
		return id;
	}

	public ArenaEntity setId(long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public ArenaEntity setName(String name) {
		this.name = name;
		return this;
	}
}
